package typings.firebaseStorage

import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseStorage.anon.Call
import typings.firebaseStorageTypes.mod.FirebaseStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerStorage(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStorage")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Define extension behavior for `registerStorage`
    */
  object firebaseAppTypesAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      var storage: js.UndefOr[js.Function1[/* storageBucket */ js.UndefOr[String], FirebaseStorage]] = js.undefined
    }
    object FirebaseApp {
      
      inline def apply(): FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FirebaseApp]
      }
      
      extension [Self <: FirebaseApp](x: Self) {
        
        inline def setStorage(value: /* storageBucket */ js.UndefOr[String] => FirebaseStorage): Self = StObject.set(x, "storage", js.Any.fromFunction1(value))
        
        inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
    
    trait FirebaseNamespace extends StObject {
      
      var storage: js.UndefOr[Call] = js.undefined
    }
    object FirebaseNamespace {
      
      inline def apply(): typings.firebaseStorage.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseStorage.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      extension [Self <: typings.firebaseStorage.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace](x: Self) {
        
        inline def setStorage(value: Call): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
        
        inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
  }
}
