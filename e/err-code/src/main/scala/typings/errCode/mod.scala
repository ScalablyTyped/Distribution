package typings.errCode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * @param {any} err - An Error
    * @param {string|Extensions} code - A string code or props to set on the error
    * @param {Extensions} [props] - Props to set on the error
    * @returns {Error & Extensions}
    */
  inline def apply(err: Any, code: String): js.Error & Extensions = (^.asInstanceOf[js.Dynamic].apply(err.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Error & Extensions]
  inline def apply(err: Any, code: String, props: Extensions): js.Error & Extensions = (^.asInstanceOf[js.Dynamic].apply(err.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Error & Extensions]
  inline def apply(err: Any, code: Extensions): js.Error & Extensions = (^.asInstanceOf[js.Dynamic].apply(err.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Error & Extensions]
  inline def apply(err: Any, code: Extensions, props: Extensions): js.Error & Extensions = (^.asInstanceOf[js.Dynamic].apply(err.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Error & Extensions]
  
  @JSImport("err-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Err = js.Error
  
  type Extensions = StringDictionary[Any]
}
