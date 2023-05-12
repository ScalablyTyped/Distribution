package typings.ethers

import typings.ethers.typesProvidersProviderMod.FeeData
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersPluginsNetworkMod {
  
  @JSImport("ethers/types/providers/plugins-network", "EnsPlugin")
  @js.native
  open class EnsPlugin () extends NetworkPlugin {
    def this(address: String) = this()
    def this(address: String, targetNetwork: Double) = this()
    def this(address: Null, targetNetwork: Double) = this()
    def this(address: Unit, targetNetwork: Double) = this()
    
    val address: String = js.native
    
    val targetNetwork: Double = js.native
  }
  
  @JSImport("ethers/types/providers/plugins-network", "FeeDataNetworkPlugin")
  @js.native
  open class FeeDataNetworkPlugin protected () extends NetworkPlugin {
    def this(feeDataFunc: js.Function1[/* provider */ Provider, js.Promise[FeeData]]) = this()
    
    def feeDataFunc: js.Function1[/* provider */ Provider, js.Promise[FeeData]] = js.native
    
    def getFeeData(provider: Provider): js.Promise[FeeData] = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @JSImport("ethers/types/providers/plugins-network", "GasCostPlugin")
  @js.native
  open class GasCostPlugin ()
    extends NetworkPlugin
       with GasCostParameters {
    def this(effectiveBlock: Double) = this()
    def this(effectiveBlock: Double, costs: GasCostParameters) = this()
    def this(effectiveBlock: Unit, costs: GasCostParameters) = this()
    
    val effectiveBlock: Double = js.native
    
    @JSName("txAccessListAddress")
    val txAccessListAddress_GasCostPlugin: Double = js.native
    
    @JSName("txAccessListStorageKey")
    val txAccessListStorageKey_GasCostPlugin: Double = js.native
    
    @JSName("txBase")
    val txBase_GasCostPlugin: Double = js.native
    
    @JSName("txCreate")
    val txCreate_GasCostPlugin: Double = js.native
    
    @JSName("txDataNonzero")
    val txDataNonzero_GasCostPlugin: Double = js.native
    
    @JSName("txDataZero")
    val txDataZero_GasCostPlugin: Double = js.native
  }
  
  @JSImport("ethers/types/providers/plugins-network", "NetworkPlugin")
  @js.native
  open class NetworkPlugin protected () extends StObject {
    def this(name: String) = this()
    
    val name: String = js.native
  }
  
  trait GasCostParameters extends StObject {
    
    var txAccessListAddress: js.UndefOr[Double] = js.undefined
    
    var txAccessListStorageKey: js.UndefOr[Double] = js.undefined
    
    var txBase: js.UndefOr[Double] = js.undefined
    
    var txCreate: js.UndefOr[Double] = js.undefined
    
    var txDataNonzero: js.UndefOr[Double] = js.undefined
    
    var txDataZero: js.UndefOr[Double] = js.undefined
  }
  object GasCostParameters {
    
    inline def apply(): GasCostParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GasCostParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GasCostParameters] (val x: Self) extends AnyVal {
      
      inline def setTxAccessListAddress(value: Double): Self = StObject.set(x, "txAccessListAddress", value.asInstanceOf[js.Any])
      
      inline def setTxAccessListAddressUndefined: Self = StObject.set(x, "txAccessListAddress", js.undefined)
      
      inline def setTxAccessListStorageKey(value: Double): Self = StObject.set(x, "txAccessListStorageKey", value.asInstanceOf[js.Any])
      
      inline def setTxAccessListStorageKeyUndefined: Self = StObject.set(x, "txAccessListStorageKey", js.undefined)
      
      inline def setTxBase(value: Double): Self = StObject.set(x, "txBase", value.asInstanceOf[js.Any])
      
      inline def setTxBaseUndefined: Self = StObject.set(x, "txBase", js.undefined)
      
      inline def setTxCreate(value: Double): Self = StObject.set(x, "txCreate", value.asInstanceOf[js.Any])
      
      inline def setTxCreateUndefined: Self = StObject.set(x, "txCreate", js.undefined)
      
      inline def setTxDataNonzero(value: Double): Self = StObject.set(x, "txDataNonzero", value.asInstanceOf[js.Any])
      
      inline def setTxDataNonzeroUndefined: Self = StObject.set(x, "txDataNonzero", js.undefined)
      
      inline def setTxDataZero(value: Double): Self = StObject.set(x, "txDataZero", value.asInstanceOf[js.Any])
      
      inline def setTxDataZeroUndefined: Self = StObject.set(x, "txDataZero", js.undefined)
    }
  }
}
