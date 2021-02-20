package typings.googleCloudStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Callback[T, U] extends StObject {
    
    var callback: U = js.native
    
    var options: T = js.native
  }
  object Callback {
    
    @scala.inline
    def apply[T, U](callback: U, options: T): Callback[T, U] = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback[T, U]]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback[_, _], T, U] (val x: Self with (Callback[T, U])) extends AnyVal {
      
      @scala.inline
      def setCallback(value: U): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
  }
  object Max {
    
    @scala.inline
    def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait OWNERROLE extends StObject {
    
    var OWNER_ROLE: String = js.native
    
    var READER_ROLE: String = js.native
    
    var WRITER_ROLE: String = js.native
  }
  object OWNERROLE {
    
    @scala.inline
    def apply(OWNER_ROLE: String, READER_ROLE: String, WRITER_ROLE: String): OWNERROLE = {
      val __obj = js.Dynamic.literal(OWNER_ROLE = OWNER_ROLE.asInstanceOf[js.Any], READER_ROLE = READER_ROLE.asInstanceOf[js.Any], WRITER_ROLE = WRITER_ROLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[OWNERROLE]
    }
    
    @scala.inline
    implicit class OWNERROLEMutableBuilder[Self <: OWNERROLE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOWNER_ROLE(value: String): Self = StObject.set(x, "OWNER_ROLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREADER_ROLE(value: String): Self = StObject.set(x, "READER_ROLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWRITER_ROLE(value: String): Self = StObject.set(x, "WRITER_ROLE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorageClass extends StObject {
    
    var storageClass: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object StorageClass {
    
    @scala.inline
    def apply(`type`: String): StorageClass = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClass]
    }
    
    @scala.inline
    implicit class StorageClassMutableBuilder[Self <: StorageClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
