package typings.firebaseStorage

import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseStorage.anon.Call
import typings.firebaseStorageTypes.mod.FirebaseStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatMod {
  
  @JSImport("@firebase/storage/dist/compat", "registerStorage")
  @js.native
  def registerStorage(instance: FirebaseNamespace): Unit = js.native
  
  /**
    * Define extension behavior for `registerStorage`
    */
  object firebaseAppTypesAugmentingMod {
    
    @js.native
    trait FirebaseApp extends StObject {
      
      var storage: js.UndefOr[js.Function1[/* storageBucket */ js.UndefOr[String], FirebaseStorage]] = js.native
    }
    object FirebaseApp {
      
      @scala.inline
      def apply(): FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FirebaseApp]
      }
      
      @scala.inline
      implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStorage(value: /* storageBucket */ js.UndefOr[String] => FirebaseStorage): Self = StObject.set(x, "storage", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      var storage: js.UndefOr[Call] = js.native
    }
    object FirebaseNamespace {
      
      @scala.inline
      def apply(): typings.firebaseStorage.compatMod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseStorage.compatMod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      @scala.inline
      implicit class FirebaseNamespaceMutableBuilder[Self <: typings.firebaseStorage.compatMod.firebaseAppTypesAugmentingMod.FirebaseNamespace] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStorage(value: Call): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
  }
}
