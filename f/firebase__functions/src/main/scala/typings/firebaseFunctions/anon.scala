package typings.firebaseFunctions

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseFunctions.mod.FirebaseApp
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseFunctions = js.native
    def apply(app: FirebaseApp): FirebaseFunctions = js.native
    
    var Functions: Instantiable0[FirebaseFunctions] = js.native
  }
  
  trait Delete extends StObject {
    
    def delete(): js.Promise[Unit]
  }
  object Delete {
    
    @scala.inline
    def apply(delete: () => js.Promise[Unit]): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  trait Details extends StObject {
    
    var details: js.UndefOr[js.Any] = js.undefined
    
    var message: js.UndefOr[js.Any] = js.undefined
    
    var status: js.UndefOr[js.Any] = js.undefined
  }
  object Details {
    
    @scala.inline
    def apply(): Details = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
}
