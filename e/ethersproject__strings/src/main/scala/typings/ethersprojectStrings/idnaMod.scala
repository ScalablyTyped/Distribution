package typings.ethersprojectStrings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idnaMod {
  
  @JSImport("@ethersproject/strings/lib/idna", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nameprep(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nameprep")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def nameprepTableA1(codepoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_nameprepTableA1")(codepoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nameprepTableB2(codepoint: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("_nameprepTableB2")(codepoint.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def nameprepTableC(codepoint: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_nameprepTableC")(codepoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
