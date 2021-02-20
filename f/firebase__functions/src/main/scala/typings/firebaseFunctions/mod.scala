package typings.firebaseFunctions

import typings.firebaseFunctions.anon.Call
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait FirebaseApp extends StObject {
    
    var functions: js.UndefOr[js.Function1[/* regionOrCustomDomain */ js.UndefOr[String], FirebaseFunctions]] = js.native
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
      def setFunctions(value: /* regionOrCustomDomain */ js.UndefOr[String] => FirebaseFunctions): Self = StObject.set(x, "functions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    var functions: js.UndefOr[Call] = js.native
  }
  object FirebaseNamespace {
    
    @scala.inline
    def apply(): FirebaseNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    @scala.inline
    implicit class FirebaseNamespaceMutableBuilder[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctions(value: Call): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    }
  }
}
