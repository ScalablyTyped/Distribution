package typings
package googleDashAppsDashScriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layoutproperties extends js.Object {
  // Layout specific properties. Only set if page_type = LAYOUT.
  var layout_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LayoutProperties
  // Master specific properties. Only set if page_type = MASTER.
  var master_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.MasterProperties
  // Notes specific properties. Only set if page_type = NOTES.
  var notes_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.NotesProperties
  // Slide specific properties. Only set if page_type = SLIDE.
  var slide_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SlideProperties
}

object Anon_Layoutproperties {
  @scala.inline
  def apply(
    layout_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LayoutProperties,
    master_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.MasterProperties,
    notes_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.NotesProperties,
    slide_properties: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SlideProperties
  ): Anon_Layoutproperties = {
    val __obj = js.Dynamic.literal(layout_properties = layout_properties, master_properties = master_properties, notes_properties = notes_properties, slide_properties = slide_properties)
  
    __obj.asInstanceOf[Anon_Layoutproperties]
  }
}

