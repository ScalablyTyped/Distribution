package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Get or sets an object that indicates the options to map the cards to the collapsible area.
    * @Default {Object}
    */
  var collapsibleCards: js.UndefOr[FieldsCollapsibleCards] = js.undefined
  /** To customize the card has been Mapped into card color field.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Content field has been Mapped into card text.
    * @Default {null}
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** ImageUrl field has been Mapped into card image.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The primarykey field is mapped to data source field. And this will used for Drag and drop and editing mainly.
    * @Default {null}
    */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** Priority field has been mapped data source field to maintain cards priority.
    * @Default {null}
    */
  var priority: js.UndefOr[java.lang.String] = js.undefined
  /** To enable swimlane grouping based on the given key field from datasource mapping.
    * @Default {null}
    */
  var swimlaneKey: js.UndefOr[java.lang.String] = js.undefined
  /** Tag field has been Mapped into card tag.
    * @Default {null}
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /** Title field has been Mapped to field in datasource for title content. If title field specified , card expand/collapse will be enabled with header and content section.
    * @Default {null}
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

