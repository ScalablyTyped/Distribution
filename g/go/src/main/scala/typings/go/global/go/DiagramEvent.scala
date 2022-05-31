package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DiagramEvent represents a more abstract event than an InputEvent.
  * They are raised on the Diagram class.
  * One can receive such events by registering a DiagramEvent listener on a Diagram
  * by calling Diagram.addDiagramListener.
  * Some DiagramEvents such as "ObjectSingleClicked" are normally
  * associated with InputEvents.
  * Some DiagramEvents such as "SelectionMoved" or "PartRotated" are associated with the
  * results of Tool-handled gestures or CommandHandler actions.
  * Some DiagramEvents are not necessarily associated with any input events at all,
  * such as "ViewportBoundsChanged", which can happen due to programmatic
  * changes to the Diagram.position and Diagram.scale properties.
  */
@JSGlobal("go.DiagramEvent")
@js.native
/**
  * The DiagramEvent class constructor produces an empty DiagramEvent.
  */
class DiagramEvent ()
  extends typings.go.mod.DiagramEvent
