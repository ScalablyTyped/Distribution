package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import typings.googleapis.Anon_ColumnId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the id, name and type of a column in a table.
  */
@js.native
trait Schema$Column extends js.Object {
  /**
    * Optional identifier of the base column. If present, this column is
    * derived from the specified base column.
    */
  var baseColumn: js.UndefOr[Anon_ColumnId] = js.native
  /**
    * Identifier for the column.
    */
  var columnId: js.UndefOr[Double] = js.native
  /**
    * Optional column description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional column predicate. Used to map table to graph data model
    * (subject,predicate,object) See
    * http://www.w3.org/TR/2014/REC-rdf11-concepts-20140225/#data-model
    */
  var graph_predicate: js.UndefOr[String] = js.native
  /**
    * Type name: a template for an individual column.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Required name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required type of the column.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Column {
  @scala.inline
  def apply(
    baseColumn: Anon_ColumnId = null,
    columnId: Int | Double = null,
    description: String = null,
    graph_predicate: String = null,
    kind: String = null,
    name: String = null,
    `type`: String = null
  ): Schema$Column = {
    val __obj = js.Dynamic.literal()
    if (baseColumn != null) __obj.updateDynamic("baseColumn")(baseColumn.asInstanceOf[js.Any])
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (graph_predicate != null) __obj.updateDynamic("graph_predicate")(graph_predicate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Column]
  }
}

