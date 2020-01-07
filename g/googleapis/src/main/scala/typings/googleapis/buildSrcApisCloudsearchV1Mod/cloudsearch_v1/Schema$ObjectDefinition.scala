package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition for an object within a data source.
  */
@js.native
trait Schema$ObjectDefinition extends js.Object {
  /**
    * Name for the object, which then defines its type. Item indexing requests
    * should set the objectType field equal to this value. For example, if
    * *name* is *Document*, then indexing requests for items of type Document
    * should set objectType equal to *Document*. Each object definition must be
    * uniquely named within a schema. The name must start with a letter and can
    * only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is
    * 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The optional object-specific options.
    */
  var options: js.UndefOr[Schema$ObjectOptions] = js.native
  /**
    * The property definitions for the object. The maximum number of elements
    * is 1000.
    */
  var propertyDefinitions: js.UndefOr[js.Array[Schema$PropertyDefinition]] = js.native
}

object Schema$ObjectDefinition {
  @scala.inline
  def apply(
    name: String = null,
    options: Schema$ObjectOptions = null,
    propertyDefinitions: js.Array[Schema$PropertyDefinition] = null
  ): Schema$ObjectDefinition = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (propertyDefinitions != null) __obj.updateDynamic("propertyDefinitions")(propertyDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjectDefinition]
  }
}

