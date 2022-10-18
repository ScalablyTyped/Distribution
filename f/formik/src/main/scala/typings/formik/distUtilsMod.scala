package typings.formik

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("formik/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[Element | Null]
  inline def getActiveElement(doc: Document): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(doc.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def getIn(obj: Any, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: String, `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: String, `def`: Any, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: String, `def`: Unit, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String], `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String], `def`: Any, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getIn(obj: Any, key: js.Array[String], `def`: Unit, p: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isEmptyArray(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")().asInstanceOf[Boolean]
  inline def isEmptyArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyChildren(children: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInputEvent(value: Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputEvent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.SyntheticEvent<any, std.Event> */ Boolean]
  
  inline def isInteger(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNaN(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(obj: Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  inline def isPromise(value: Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  inline def isString(obj: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def setIn(obj: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setNestedObjectValues[T](`object`: Any, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setNestedObjectValues[T](`object`: Any, value: Any, visited: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setNestedObjectValues[T](`object`: Any, value: Any, visited: Any, response: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setNestedObjectValues[T](`object`: Any, value: Any, visited: Unit, response: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
}
