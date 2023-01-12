package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsMod {
  
  @JSImport("@firebase/util/dist/src/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultAppConfig(): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAppConfig")().asInstanceOf[js.UndefOr[Record[String, String]]]
  
  inline def getDefaultEmulatorHost(productName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEmulatorHost")(productName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getDefaultEmulatorHostnameAndPort(productName: String): js.UndefOr[js.Tuple2[/* hostname */ String, /* port */ Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEmulatorHostnameAndPort")(productName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Tuple2[/* hostname */ String, /* port */ Double]]]
  
  inline def getExperimentalSetting[T /* <: ExperimentalKey */](name: T): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/util.@firebase/util/dist/src/defaults.FirebaseDefaults[/ * template literal string: _${T} * / string] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExperimentalSetting")(name.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @firebase/util.@firebase/util/dist/src/defaults.FirebaseDefaults[/ * template literal string: _${T} * / string] */ js.Any]
  
  object global {
    
    @JSGlobal("__FIREBASE_DEFAULTS__")
    @js.native
    def __FIREBASE_DEFAULTS__ : js.UndefOr[FirebaseDefaults] = js.native
    inline def __FIREBASE_DEFAULTS___=(x: js.UndefOr[FirebaseDefaults]): Unit = js.Dynamic.global.updateDynamic("__FIREBASE_DEFAULTS__")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseUtil.firebaseUtilStrings.authTokenSyncURL
    - typings.firebaseUtil.firebaseUtilStrings.authIdTokenMaxAge
  */
  trait ExperimentalKey extends StObject
  object ExperimentalKey {
    
    inline def authIdTokenMaxAge: typings.firebaseUtil.firebaseUtilStrings.authIdTokenMaxAge = "authIdTokenMaxAge".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.authIdTokenMaxAge]
    
    inline def authTokenSyncURL: typings.firebaseUtil.firebaseUtilStrings.authTokenSyncURL = "authTokenSyncURL".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.authTokenSyncURL]
  }
  
  trait FirebaseDefaults
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _authIdTokenMaxAge: js.UndefOr[Double] = js.undefined
    
    var _authTokenSyncURL: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Record[String, String]] = js.undefined
    
    var emulatorHosts: js.UndefOr[Record[String, String]] = js.undefined
  }
  object FirebaseDefaults {
    
    inline def apply(): FirebaseDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseDefaults] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Record[String, String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEmulatorHosts(value: Record[String, String]): Self = StObject.set(x, "emulatorHosts", value.asInstanceOf[js.Any])
      
      inline def setEmulatorHostsUndefined: Self = StObject.set(x, "emulatorHosts", js.undefined)
      
      inline def set_authIdTokenMaxAge(value: Double): Self = StObject.set(x, "_authIdTokenMaxAge", value.asInstanceOf[js.Any])
      
      inline def set_authIdTokenMaxAgeUndefined: Self = StObject.set(x, "_authIdTokenMaxAge", js.undefined)
      
      inline def set_authTokenSyncURL(value: String): Self = StObject.set(x, "_authTokenSyncURL", value.asInstanceOf[js.Any])
      
      inline def set_authTokenSyncURLUndefined: Self = StObject.set(x, "_authTokenSyncURL", js.undefined)
    }
  }
}
