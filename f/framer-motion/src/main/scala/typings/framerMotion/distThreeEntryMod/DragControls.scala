package typings.framerMotion.distThreeEntryMod

import typings.react.mod.PointerEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Can manually trigger a drag gesture on one or more `drag`-enabled `motion` components.
  *
  * ```jsx
  * const dragControls = useDragControls()
  *
  * function startDrag(event) {
  *   dragControls.start(event, { snapToCursor: true })
  * }
  *
  * return (
  *   <>
  *     <div onPointerDown={startDrag} />
  *     <motion.div drag="x" dragControls={dragControls} />
  *   </>
  * )
  * ```
  *
  * @public
  */
@js.native
trait DragControls extends StObject {
  
  /* private */ var componentControls: Any = js.native
  
  /**
    * Start a drag gesture on every `motion` component that has this set of drag controls
    * passed into it via the `dragControls` prop.
    *
    * ```jsx
    * dragControls.start(e, {
    *   snapToCursor: true
    * })
    * ```
    *
    * @param event - PointerEvent
    * @param options - Options
    *
    * @public
    */
  def start(event: PointerEvent[Element]): Unit = js.native
  def start(event: PointerEvent[Element], options: DragControlOptions): Unit = js.native
  def start(event: typings.std.PointerEvent): Unit = js.native
  def start(event: typings.std.PointerEvent, options: DragControlOptions): Unit = js.native
}
