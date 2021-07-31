package typings.fluxible

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.baseStoreMod.^
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    /**
      * POST request to the server
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param body json request body
      * @param callback
      */
    def create(
      resource: String,
      params: js.Any,
      body: js.Any,
      callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
    ): Unit
    
    /**
      *
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param callback
      */
    def delete(
      resource: String,
      params: js.Any,
      callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
    ): Unit
    
    /**
      * GET request to the server
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param callback
      */
    def read(
      resource: String,
      params: js.Any,
      callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
    ): Unit
    
    /**
      *
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param body json request body
      * @param callback
      */
    def update(
      resource: String,
      params: js.Any,
      body: js.Any,
      callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
    ): Unit
  }
  object Create {
    
    @scala.inline
    def apply(
      create: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
      delete: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
      read: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
      update: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit
    ): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction3(delete), read = js.Any.fromFunction3(read), update = js.Any.fromFunction4(update))
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDelete(value: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRead(value: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdate(value: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait Instantiable[T /* <: ^[js.Object] */]
    extends StObject
       with Instantiable1[/* dispatcher */ DispatcherInterface, T]
}
