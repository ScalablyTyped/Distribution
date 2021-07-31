package typings.fcostarodrigoWalk

import org.scalablytyped.runtime.Shortcut
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@fcostarodrigo/walk", JSImport.Namespace)
  @js.native
  val ^ : Walk = js.native
  
  type Walk = js.Function3[
    /* path */ js.UndefOr[String], 
    /* listFolders */ js.UndefOr[Boolean], 
    /* walkFolder */ js.UndefOr[js.Function1[/* path */ String, Boolean]], 
    AsyncIterable[String]
  ]
  
  type _To = Walk
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Walk = ^
}
