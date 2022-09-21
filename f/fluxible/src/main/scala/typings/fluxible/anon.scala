package typings.fluxible

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.DispatcherInterface
import typings.fluxible.baseStoreMod.^
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
      params: Any,
      body: Any,
      callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]
    ): Unit
    
    /**
      *
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param callback
      */
    def delete(resource: String, params: Any, callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]): Unit
    
    /**
      * GET request to the server
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param callback
      */
    def read(resource: String, params: Any, callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]): Unit
    
    /**
      *
      * @param resource name of resourse
      * @param params query string parameters as key-value object
      * @param body json request body
      * @param callback
      */
    def update(
      resource: String,
      params: Any,
      body: Any,
      callback: js.Function2[/* error */ js.Error, /* data */ Any, Unit]
    ): Unit
  }
  object Create {
    
    inline def apply(
      create: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit,
      delete: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit,
      read: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit,
      update: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit
    ): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction3(delete), read = js.Any.fromFunction3(read), update = js.Any.fromFunction4(update))
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      inline def setDelete(value: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      inline def setRead(value: (String, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      inline def setUpdate(value: (String, Any, Any, js.Function2[/* error */ js.Error, /* data */ Any, Unit]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait Instantiable[T /* <: ^[js.Object] */]
    extends StObject
       with Instantiable1[/* dispatcher */ DispatcherInterface, T]
}
