package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.AbstractProviderPlugin
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersEnsResolverMod {
  
  @JSImport("ethers/types/providers/ens-resolver", "BasicMulticoinProviderPlugin")
  @js.native
  open class BasicMulticoinProviderPlugin () extends MulticoinProviderPlugin
  
  @JSImport("ethers/types/providers/ens-resolver", "EnsResolver")
  @js.native
  open class EnsResolver protected () extends StObject {
    def this(provider: AbstractProvider, address: String, name: String) = this()
    
    /**
      *  When resolving an avatar, there are many steps involved, such
      *  fetching metadata and possibly validating ownership of an
      *  NFT.
      *
      *  This method can be used to examine each step and the value it
      *  was working from.
      */
    def _getAvatar(): js.Promise[AvatarResult] = js.native
    
    /**
      *  The address of the resolver.
      */
    var address: String = js.native
    
    /**
      *  Resolves to the address for %%coinType%% or null if the
      *  provided %%coinType%% has not been configured.
      */
    def getAddress(): js.Promise[Null | String] = js.native
    def getAddress(coinType: Double): js.Promise[Null | String] = js.native
    
    /**
      *  Resolves to the avatar url or ``null`` if the avatar is either
      *  unconfigured or incorrectly configured (e.g. references an NFT
      *  not owned by the address).
      *
      *  If diagnosing issues with configurations, the [[_getAvatar]]
      *  method may be useful.
      */
    def getAvatar(): js.Promise[Null | String] = js.native
    
    /**
      *  Rsolves to the content-hash or ``null`` if unconfigured.
      */
    def getContentHash(): js.Promise[Null | String] = js.native
    
    /**
      *  Resolves to the EIP-643 text record for %%key%%, or ``null``
      *  if unconfigured.
      */
    def getText(key: String): js.Promise[Null | String] = js.native
    
    /**
      *  The name this resolver was resolved against.
      */
    var name: String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The connected provider.
      */
    var provider: AbstractProvider = js.native
    
    /**
      *  Resolves to true if the resolver supports wildcard resolution.
      */
    def supportsWildcard(): js.Promise[Boolean] = js.native
  }
  /* static members */
  object EnsResolver {
    
    @JSImport("ethers/types/providers/ens-resolver", "EnsResolver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Resolve to the ENS resolver for %%name%% using %%provider%% or
      *  ``null`` if unconfigured.
      */
    inline def fromName(provider: AbstractProvider, name: String): js.Promise[Null | EnsResolver] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(provider.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | EnsResolver]]
    
    inline def getEnsAddress(provider: Provider): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnsAddress")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  /* note: abstract class */ @JSImport("ethers/types/providers/ens-resolver", "MulticoinProviderPlugin")
  @js.native
  open class MulticoinProviderPlugin protected ()
    extends StObject
       with AbstractProviderPlugin {
    def this(name: String) = this()
    
    def connect(proivder: Provider): MulticoinProviderPlugin = js.native
    /* CompleteClass */
    override def connect(provider: AbstractProvider): AbstractProviderPlugin = js.native
    
    def decodeAddress(coinType: Double, data: BytesLike): js.Promise[String] = js.native
    
    def encodeAddress(coinType: Double, address: String): js.Promise[String] = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    def supportsCoinType(coinType: Double): Boolean = js.native
  }
  
  trait AvatarLinkage extends StObject {
    
    var `type`: AvatarLinkageType
    
    var value: String
  }
  object AvatarLinkage {
    
    inline def apply(`type`: AvatarLinkageType, value: String): AvatarLinkage = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarLinkage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarLinkage] (val x: Self) extends AnyVal {
      
      inline def setType(value: AvatarLinkageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.ethersStrings.name
    - typings.ethers.ethersStrings.avatar
    - typings.ethers.ethersStrings.Exclamationmarkavatar
    - typings.ethers.ethersStrings.url
    - typings.ethers.ethersStrings.data
    - typings.ethers.ethersStrings.ipfs
    - typings.ethers.ethersStrings.erc721
    - typings.ethers.ethersStrings.erc1155
    - typings.ethers.ethersStrings.`Exclamationmarkerc721-caip`
    - typings.ethers.ethersStrings.`Exclamationmarkerc1155-caip`
    - typings.ethers.ethersStrings.Exclamationmarkowner
    - typings.ethers.ethersStrings.owner
    - typings.ethers.ethersStrings.Exclamationmarkbalance
    - typings.ethers.ethersStrings.balance
    - typings.ethers.ethersStrings.`metadata-url-base`
    - typings.ethers.ethersStrings.`metadata-url-expanded`
    - typings.ethers.ethersStrings.`metadata-url`
    - typings.ethers.ethersStrings.`Exclamationmarkmetadata-url`
    - typings.ethers.ethersStrings.Exclamationmarkmetadata
    - typings.ethers.ethersStrings.metadata
    - typings.ethers.ethersStrings.ExclamationmarkimageUrl
    - typings.ethers.ethersStrings.`imageUrl-ipfs`
    - typings.ethers.ethersStrings.imageUrl
    - typings.ethers.ethersStrings.`ExclamationmarkimageUrl-ipfs`
  */
  trait AvatarLinkageType extends StObject
  object AvatarLinkageType {
    
    inline def Exclamationmarkavatar: typings.ethers.ethersStrings.Exclamationmarkavatar = "!avatar".asInstanceOf[typings.ethers.ethersStrings.Exclamationmarkavatar]
    
    inline def Exclamationmarkbalance: typings.ethers.ethersStrings.Exclamationmarkbalance = "!balance".asInstanceOf[typings.ethers.ethersStrings.Exclamationmarkbalance]
    
    inline def `Exclamationmarkerc1155-caip`: typings.ethers.ethersStrings.`Exclamationmarkerc1155-caip` = "!erc1155-caip".asInstanceOf[typings.ethers.ethersStrings.`Exclamationmarkerc1155-caip`]
    
    inline def `Exclamationmarkerc721-caip`: typings.ethers.ethersStrings.`Exclamationmarkerc721-caip` = "!erc721-caip".asInstanceOf[typings.ethers.ethersStrings.`Exclamationmarkerc721-caip`]
    
    inline def ExclamationmarkimageUrl: typings.ethers.ethersStrings.ExclamationmarkimageUrl = "!imageUrl".asInstanceOf[typings.ethers.ethersStrings.ExclamationmarkimageUrl]
    
    inline def `ExclamationmarkimageUrl-ipfs`: typings.ethers.ethersStrings.`ExclamationmarkimageUrl-ipfs` = "!imageUrl-ipfs".asInstanceOf[typings.ethers.ethersStrings.`ExclamationmarkimageUrl-ipfs`]
    
    inline def Exclamationmarkmetadata: typings.ethers.ethersStrings.Exclamationmarkmetadata = "!metadata".asInstanceOf[typings.ethers.ethersStrings.Exclamationmarkmetadata]
    
    inline def `Exclamationmarkmetadata-url`: typings.ethers.ethersStrings.`Exclamationmarkmetadata-url` = "!metadata-url".asInstanceOf[typings.ethers.ethersStrings.`Exclamationmarkmetadata-url`]
    
    inline def Exclamationmarkowner: typings.ethers.ethersStrings.Exclamationmarkowner = "!owner".asInstanceOf[typings.ethers.ethersStrings.Exclamationmarkowner]
    
    inline def avatar: typings.ethers.ethersStrings.avatar = "avatar".asInstanceOf[typings.ethers.ethersStrings.avatar]
    
    inline def balance: typings.ethers.ethersStrings.balance = "balance".asInstanceOf[typings.ethers.ethersStrings.balance]
    
    inline def data: typings.ethers.ethersStrings.data = "data".asInstanceOf[typings.ethers.ethersStrings.data]
    
    inline def erc1155: typings.ethers.ethersStrings.erc1155 = "erc1155".asInstanceOf[typings.ethers.ethersStrings.erc1155]
    
    inline def erc721: typings.ethers.ethersStrings.erc721 = "erc721".asInstanceOf[typings.ethers.ethersStrings.erc721]
    
    inline def imageUrl: typings.ethers.ethersStrings.imageUrl = "imageUrl".asInstanceOf[typings.ethers.ethersStrings.imageUrl]
    
    inline def `imageUrl-ipfs`: typings.ethers.ethersStrings.`imageUrl-ipfs` = "imageUrl-ipfs".asInstanceOf[typings.ethers.ethersStrings.`imageUrl-ipfs`]
    
    inline def ipfs: typings.ethers.ethersStrings.ipfs = "ipfs".asInstanceOf[typings.ethers.ethersStrings.ipfs]
    
    inline def metadata: typings.ethers.ethersStrings.metadata = "metadata".asInstanceOf[typings.ethers.ethersStrings.metadata]
    
    inline def `metadata-url`: typings.ethers.ethersStrings.`metadata-url` = "metadata-url".asInstanceOf[typings.ethers.ethersStrings.`metadata-url`]
    
    inline def `metadata-url-base`: typings.ethers.ethersStrings.`metadata-url-base` = "metadata-url-base".asInstanceOf[typings.ethers.ethersStrings.`metadata-url-base`]
    
    inline def `metadata-url-expanded`: typings.ethers.ethersStrings.`metadata-url-expanded` = "metadata-url-expanded".asInstanceOf[typings.ethers.ethersStrings.`metadata-url-expanded`]
    
    inline def name: typings.ethers.ethersStrings.name = "name".asInstanceOf[typings.ethers.ethersStrings.name]
    
    inline def owner: typings.ethers.ethersStrings.owner = "owner".asInstanceOf[typings.ethers.ethersStrings.owner]
    
    inline def url: typings.ethers.ethersStrings.url = "url".asInstanceOf[typings.ethers.ethersStrings.url]
  }
  
  trait AvatarResult extends StObject {
    
    var linkage: js.Array[AvatarLinkage]
    
    var url: Null | String
  }
  object AvatarResult {
    
    inline def apply(linkage: js.Array[AvatarLinkage]): AvatarResult = {
      val __obj = js.Dynamic.literal(linkage = linkage.asInstanceOf[js.Any], url = null)
      __obj.asInstanceOf[AvatarResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarResult] (val x: Self) extends AnyVal {
      
      inline def setLinkage(value: js.Array[AvatarLinkage]): Self = StObject.set(x, "linkage", value.asInstanceOf[js.Any])
      
      inline def setLinkageVarargs(value: AvatarLinkage*): Self = StObject.set(x, "linkage", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
}
