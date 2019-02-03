package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Models hold the essential data of a diagram, describing the basic entities and their properties and relationships
  * without specifying the appearance and behavior of the Nodes and Links and Groups that represent them visually.
  * Models tend to hold only relatively simple data, making them easy to persist by serialization as JSON or XML formatted text.
  */
@JSImport("go", "Model")
@js.native
/**
  * You probably don't want to call this constructor, because this class does not support links (relationships between nodes) or groups (nodes and links and subgraphs as nodes): instead, create instances of a subclass such as GraphLinksModel or TreeModel.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Parts.
  */
class Model ()
  extends goLib.goMod.goNs.Model {
  def this(nodedataarray: js.Array[js.Object]) = this()
}

/* static members */
@JSImport("go", "Model")
@js.native
object Model extends js.Object {
  /**
    * This static function parses a string in JSON format and constructs, initializes, and returns a model.
    * Note that properties with values that are functions are not written out by .toJson,
    * so reading in such a model will require constructing such a model, initializing its functional property values,
    * and explicitly passing it in as the second argument.
    * @param {string} s a String in JSON format containing all of the persistent properties of the model, or an Object already read from JSON text.
    * @param {model=} model an optional model to be modified; if not supplied, it constructs and returns a new model whose name is specified by the "class" property.
    */
  def fromJson(s: java.lang.String): goLib.goMod.goNs.Model = js.native
  def fromJson(s: java.lang.String, model: goLib.goMod.goNs.Model): goLib.goMod.goNs.Model = js.native
  def fromJson(s: js.Object): goLib.goMod.goNs.Model = js.native
  def fromJson(s: js.Object, model: goLib.goMod.goNs.Model): goLib.goMod.goNs.Model = js.native
}

