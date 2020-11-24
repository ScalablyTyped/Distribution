package typings.draftJs.mod.Draft.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Base {
  
  type DraftBlockRenderMap = typings.immutable.Immutable.Map[
    typings.draftJs.mod.Draft.Model.Constants.DraftBlockType, 
    typings.draftJs.mod.Draft.Model.ImmutableData.DraftBlockRenderConfig
  ]
  
  type DraftStyleMap = org.scalablytyped.runtime.StringDictionary[typings.react.mod.CSSProperties]
  
  type EditorCommand = typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | java.lang.String
}
