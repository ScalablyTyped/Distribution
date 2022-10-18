package typings.fluentuiMergeStyles

import typings.fluentuiMergeStyles.libIkeyframesMod.IKeyframes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeyframesMod {
  
  @JSImport("@fluentui/merge-styles/lib/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyframes(timeline: IKeyframes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(timeline.asInstanceOf[js.Any]).asInstanceOf[String]
}
