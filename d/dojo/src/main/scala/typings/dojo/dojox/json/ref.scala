package typings.dojo.dojox.json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/json/ref.html
  *
  * Adds advanced JSON {de}serialization capabilities to the base json library.
  * This enhances the capabilities of dojo.toJson and dojo.fromJson,
  * adding referencing support, date handling, and other extra format handling.
  * On parsing, references are resolved. When references are made to
  * ids/objects that have been loaded yet, the loader function will be set to
  * _loadObject to denote a lazy loading (not loaded yet) object.
  *
  */
trait ref extends js.Object {
  /**
    *
    */
  var refAttribute: String
  /**
    *
    */
  var serializeFunctions: Boolean
  /**
    * evaluates the passed string-form of a JSON object.
    *
    * @param str a string literal of a JSON item, for instance:'{ "foo": [ "bar", 1, { "baz": "thud" } ] }'
    * @param args               OptionalSee resolveJson
    */
  def fromJson(str: String, args: js.Object): js.Any
  /**
    * Indexes and resolves references in the JSON object.
    * A JSON Schema object that can be used to advise the handling of the JSON (defining ids, date properties, urls, etc)
    *
    * @param root The root object of the object graph to be processed
    * @param args               OptionalObject with additional arguments:The index parameter:  This is the index object (map) to use to store an index of all the objects.  If you are using inter-message referencing, you must provide the same object for each call.The defaultId parameter:  This is the default id to use for the root object (if it doesn't define it's own id)The idPrefix parameter:  This the prefix to use for the ids as they enter the index. This allows multiple tables  to use ids (that might otherwise collide) that enter the same global index.  idPrefix should be in the form "/Service/".  For example,  if the idPrefix is "/Table/", and object is encountered {id:"4",...}, this would go in the  index as "/Table/4".The idAttribute parameter:  This indicates what property is the identity property. This defaults to "id"The assignAbsoluteIds parameter:  This indicates that the resolveJson should assign absolute ids (__id) as the objects are being parsed.The schemas parameter:  This provides a map of schemas, from which prototypes can be retrievedThe loader parameter:  This is a function that is called added to the reference objects that can't be resolved (lazy objects)
    */
  def resolveJson(root: js.Object, args: js.Object): js.Any
  /**
    * Create a JSON serialization of an object.
    * This has support for referencing, including circular references, duplicate references, and out-of-message references
    * id and path-based referencing is supported as well and is based on http://www.json.com/2007/10/19/json-referencing-proposal-and-library/.
    *
    * @param it an object to be serialized.
    * @param prettyPrint               Optionalif true, we indent objects and arrays to make the output prettier.The variable dojo.toJsonIndentStr is used as the indent string-- to use something other than the default (tab),change that variable before calling dojo.toJson().
    * @param idPrefix               OptionalThe prefix that has been used for the absolute ids
    * @param indexSubObjects               Optional
    */
  def toJson(it: js.Object, prettyPrint: Boolean, idPrefix: js.Object, indexSubObjects: js.Object): js.Any
}

object ref {
  @scala.inline
  def apply(
    fromJson: (String, js.Object) => js.Any,
    refAttribute: String,
    resolveJson: (js.Object, js.Object) => js.Any,
    serializeFunctions: Boolean,
    toJson: (js.Object, Boolean, js.Object, js.Object) => js.Any
  ): ref = {
    val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction2(fromJson), refAttribute = refAttribute, resolveJson = js.Any.fromFunction2(resolveJson), serializeFunctions = serializeFunctions, toJson = js.Any.fromFunction4(toJson))
  
    __obj.asInstanceOf[ref]
  }
}

