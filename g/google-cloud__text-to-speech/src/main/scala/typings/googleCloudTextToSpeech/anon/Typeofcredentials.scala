package typings.googleCloudTextToSpeech.anon

import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcredentials extends StObject {
  
  /**
    * Combine any number of CallCredentials into a single CallCredentials
    * object.
    * @param first The first CallCredentials object.
    * @param additional Any number of additional CallCredentials objects.
    * @return The resulting CallCredentials object.
    */
  def combineCallCredentials(first: CallCredentials, additional: CallCredentials*): CallCredentials
  
  /**
    * Combine a ChannelCredentials with any number of CallCredentials into a
    * single ChannelCredentials object.
    * @param channelCredentials The ChannelCredentials object.
    * @param callCredentials Any number of CallCredentials objects.
    * @return The resulting ChannelCredentials object.
    */
  def combineChannelCredentials(channelCredentials: ChannelCredentials, callCredentials: CallCredentials*): ChannelCredentials
  
  var createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
  
  var createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
  
  var createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
  
  var createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
  
  var createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
  
  var createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
}
object Typeofcredentials {
  
  inline def apply(
    combineCallCredentials: (CallCredentials, /* repeated */ CallCredentials) => CallCredentials,
    combineChannelCredentials: (ChannelCredentials, /* repeated */ CallCredentials) => ChannelCredentials,
    createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any,
    createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any,
    createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any,
    createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any,
    createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any,
    createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
  ): Typeofcredentials = {
    val __obj = js.Dynamic.literal(combineCallCredentials = js.Any.fromFunction2(combineCallCredentials), combineChannelCredentials = js.Any.fromFunction2(combineChannelCredentials), createEmpty = createEmpty.asInstanceOf[js.Any], createFromGoogleCredential = createFromGoogleCredential.asInstanceOf[js.Any], createFromMetadataGenerator = createFromMetadataGenerator.asInstanceOf[js.Any], createFromSecureContext = createFromSecureContext.asInstanceOf[js.Any], createInsecure = createInsecure.asInstanceOf[js.Any], createSsl = createSsl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofcredentials] (val x: Self) extends AnyVal {
    
    inline def setCombineCallCredentials(value: (CallCredentials, /* repeated */ CallCredentials) => CallCredentials): Self = StObject.set(x, "combineCallCredentials", js.Any.fromFunction2(value))
    
    inline def setCombineChannelCredentials(value: (ChannelCredentials, /* repeated */ CallCredentials) => ChannelCredentials): Self = StObject.set(x, "combineChannelCredentials", js.Any.fromFunction2(value))
    
    inline def setCreateEmpty(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
    ): Self = StObject.set(x, "createEmpty", value.asInstanceOf[js.Any])
    
    inline def setCreateFromGoogleCredential(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
    ): Self = StObject.set(x, "createFromGoogleCredential", value.asInstanceOf[js.Any])
    
    inline def setCreateFromMetadataGenerator(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
    ): Self = StObject.set(x, "createFromMetadataGenerator", value.asInstanceOf[js.Any])
    
    inline def setCreateFromSecureContext(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
    ): Self = StObject.set(x, "createFromSecureContext", value.asInstanceOf[js.Any])
    
    inline def setCreateInsecure(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
    ): Self = StObject.set(x, "createInsecure", value.asInstanceOf[js.Any])
    
    inline def setCreateSsl(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
    ): Self = StObject.set(x, "createSsl", value.asInstanceOf[js.Any])
  }
}
