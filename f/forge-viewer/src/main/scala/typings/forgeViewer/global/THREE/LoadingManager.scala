package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.LoadingManager")
@js.native
open class LoadingManager ()
  extends StObject
     with typings.forgeViewer.THREE.LoadingManager {
  def this(onLoad: js.Function0[Unit]) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
  ) = this()
  def this(
    onLoad: Unit,
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
  ) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
    onError: js.Function0[Unit]
  ) = this()
  def this(onLoad: js.Function0[Unit], onProgress: Unit, onError: js.Function0[Unit]) = this()
  def this(
    onLoad: Unit,
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
    onError: js.Function0[Unit]
  ) = this()
  def this(onLoad: Unit, onProgress: Unit, onError: js.Function0[Unit]) = this()
  
  /* CompleteClass */
  override def itemEnd(url: String): Unit = js.native
  
  /* CompleteClass */
  override def itemError(url: String): Unit = js.native
  
  /* CompleteClass */
  override def itemStart(url: String): Unit = js.native
  
  /* CompleteClass */
  override def onError(): Unit = js.native
  
  /* CompleteClass */
  override def onLoad(): Unit = js.native
  
  /* CompleteClass */
  override def onProgress(item: Any, loaded: Double, total: Double): Unit = js.native
  
  /* CompleteClass */
  override def onStart(): Unit = js.native
}
