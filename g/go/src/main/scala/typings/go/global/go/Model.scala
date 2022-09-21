package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Models hold the essential data of a diagram, describing the basic entities and their properties and relationships
  * without specifying the appearance and behavior of the Nodes and Links and Groups that represent them visually.
  * Models tend to hold only relatively simple data, making them easy to persist by serialization as JSON or XML formatted text.
  */
@JSGlobal("go.Model")
@js.native
/**
  * You probably don't want to call this constructor, because this class does not support links (relationships between nodes) or groups (nodes and links and subgraphs as nodes): instead, create instances of a subclass such as GraphLinksModel or TreeModel.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Parts.
  */
open class Model ()
  extends typings.go.mod.Model {
  def this(nodedataarray: js.Array[js.Object]) = this()
}
object Model {
  
  @JSGlobal("go.Model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function parses a string in JSON format and constructs, initializes, and returns a model.
    * Note that properties with values that are functions are not written out by .toJson,
    * so reading in such a model will require constructing such a model, initializing its functional property values,
    * and explicitly passing it in as the second argument.
    * @param {string} s a String in JSON format containing all of the persistent properties of the model, or an Object already read from JSON text.
    * @param {model=} model an optional model to be modified; if not supplied, it constructs and returns a new model whose name is specified by the "class" property.
    */
  /* static member */
  inline def fromJson(s: String): typings.go.mod.Model = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(s.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Model]
  inline def fromJson(s: String, model: typings.go.mod.Model): typings.go.mod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(s.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[typings.go.mod.Model]
  inline def fromJson(s: js.Object): typings.go.mod.Model = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(s.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Model]
  inline def fromJson(s: js.Object, model: typings.go.mod.Model): typings.go.mod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(s.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[typings.go.mod.Model]
}
