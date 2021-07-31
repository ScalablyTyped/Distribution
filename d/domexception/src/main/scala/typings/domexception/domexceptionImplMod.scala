package typings.domexception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domexceptionImplMod {
  
  @JSImport("domexception/lib/DOMException-impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domexception/lib/DOMException-impl", "implementation")
  @js.native
  class implementation protected ()
    extends StObject
       with DOMExceptionImpl {
    def this(globalObject: js.Object, hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]) = this()
    def this(
      globalObject: js.Object,
      hasMessageName: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
      privateData: js.Object
    ) = this()
    
    /* CompleteClass */
    override val code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def init(impl: DOMExceptionImpl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(impl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DOMExceptionImpl extends StObject {
    
    val code: String
    
    var message: String
    
    var name: String
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
