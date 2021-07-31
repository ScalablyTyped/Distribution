package typings.formik

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("formik/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getActiveElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[Element | Null]
  @scala.inline
  def getActiveElement(doc: Document): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(doc.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @scala.inline
  def getIn(obj: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: String, `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getIn(obj: js.Any, key: js.Array[String], `def`: Unit, p: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isEmptyArray(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")().asInstanceOf[Boolean]
  @scala.inline
  def isEmptyArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmptyChildren(children: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputEvent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.SyntheticEvent<any, std.Event> */ Boolean]
  
  @scala.inline
  def isInteger(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNaN(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(obj: js.Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  @scala.inline
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  @scala.inline
  def isString(obj: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: Unit, response: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setNestedObjectValues")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], visited.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[T]
}
