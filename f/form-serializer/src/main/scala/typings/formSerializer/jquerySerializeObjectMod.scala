package typings.formSerializer

import typings.formSerializer.FormSerializer.FormSerializerPatterns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jquerySerializeObjectMod {
  
  @JSImport("jquery-serialize-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jquery-serialize-object", "patterns")
  @js.native
  def patterns: FormSerializerPatterns = js.native
  @scala.inline
  def patterns_=(x: FormSerializerPatterns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("patterns")(x.asInstanceOf[js.Any])
}
