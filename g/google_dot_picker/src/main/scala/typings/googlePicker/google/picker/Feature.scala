package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Feature extends StObject
@JSGlobal("google.picker.Feature")
@js.native
object Feature extends StObject {
  
  // Show only documents owned by the user when showing items from Google Drive.
  @js.native
  sealed trait MINE_ONLY
    extends StObject
       with Feature
  
  // Allow user to choose more than one item.
  @js.native
  sealed trait MULTISELECT_ENABLED
    extends StObject
       with Feature
  
  // Hide the navigation pane. If the navigation pane is hidden, users can only select from the first view chosen.
  @js.native
  sealed trait NAV_HIDDEN
    extends StObject
       with Feature
  
  // For photo uploads, controls whether per-photo selection (as opposed to per-album) selection is enabled.
  @js.native
  sealed trait SIMPLE_UPLOAD_ENABLED
    extends StObject
       with Feature
  
  // Whether Shared Drive items should be included in results.
  @js.native
  sealed trait SUPPORT_DRIVES
    extends StObject
       with Feature
  
  // Whether Shared team Drive items should be included in results.
  /** @deprecated - use google.picker.Feature.SUPPORT_DRIVES instead */
  @js.native
  sealed trait SUPPORT_TEAM_DRIVES
    extends StObject
       with Feature
}
