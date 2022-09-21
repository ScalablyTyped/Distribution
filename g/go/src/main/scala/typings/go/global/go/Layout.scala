package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the base class for all of the predefined diagram layout implementations.
  * They only arrange Parts (primarily Nodes and Links) in a Diagram,
  * not to GraphObjects in Panels (i.e. panel layout).
  */
@JSGlobal("go.Layout")
@js.native
/**
  * Create a minimal layout that only positions Nodes that do not have a location.
  */
open class Layout ()
  extends typings.go.mod.Layout
