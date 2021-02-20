package typings.domexception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domexceptionImplMod {
  
  @JSImport("domexception/lib/DOMException-impl", "implementation")
  @js.native
  class implementation protected () extends DOMExceptionImpl {
    def this(globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]) = this()
    def this(
      globalObject: js.Object,
      hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
      privateData: js.Object
    ) = this()
  }
  
  @JSImport("domexception/lib/DOMException-impl", "init")
  @js.native
  def init(impl: DOMExceptionImpl): Unit = js.native
  
  @js.native
  trait DOMExceptionImpl extends StObject {
    
    val code: String = js.native
    
    var message: String = js.native
    
    var name: String = js.native
  }
  object DOMExceptionImpl {
    
    @scala.inline
    def apply(code: String, message: String, name: String): DOMExceptionImpl = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMExceptionImpl]
    }
    
    @scala.inline
    implicit class DOMExceptionImplMutableBuilder[Self <: DOMExceptionImpl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
