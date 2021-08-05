package typings.googleCloudStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback[T, U] extends StObject {
    
    var callback: U
    
    var options: T
  }
  object Callback {
    
    inline def apply[T, U](callback: U, options: T): Callback[T, U] = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback[T, U]]
    }
    
    extension [Self <: Callback[?, ?], T, U](x: Self & (Callback[T, U])) {
      
      inline def setCallback(value: U): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object Max {
    
    inline def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait OWNERROLE extends StObject {
    
    var OWNER_ROLE: String
    
    var READER_ROLE: String
    
    var WRITER_ROLE: String
  }
  object OWNERROLE {
    
    inline def apply(OWNER_ROLE: String, READER_ROLE: String, WRITER_ROLE: String): OWNERROLE = {
      val __obj = js.Dynamic.literal(OWNER_ROLE = OWNER_ROLE.asInstanceOf[js.Any], READER_ROLE = READER_ROLE.asInstanceOf[js.Any], WRITER_ROLE = WRITER_ROLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[OWNERROLE]
    }
    
    extension [Self <: OWNERROLE](x: Self) {
      
      inline def setOWNER_ROLE(value: String): Self = StObject.set(x, "OWNER_ROLE", value.asInstanceOf[js.Any])
      
      inline def setREADER_ROLE(value: String): Self = StObject.set(x, "READER_ROLE", value.asInstanceOf[js.Any])
      
      inline def setWRITER_ROLE(value: String): Self = StObject.set(x, "WRITER_ROLE", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageClass extends StObject {
    
    var storageClass: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object StorageClass {
    
    inline def apply(`type`: String): StorageClass = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClass]
    }
    
    extension [Self <: StorageClass](x: Self) {
      
      inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
