package typings.durandal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Durandal events originate from backbone.js but also combine some ideas from signals.js as well as some additional improvements.
  * Events can be installed into any object and are installed into the `app` module by default for convenient app-wide eventing.
  * @requires system
  */
object eventsMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("durandal/events", JSImport.Namespace)
  @js.native
  class ^ ()
    extends DurandalEventSupport[js.Object]
  @JSImport("durandal/events", JSImport.Namespace)
  @js.native
  val ^ : DurandalEventModule = js.native
  
  type _To = DurandalEventModule
  
  /* This means you don't have to write `^`, but can instead just say `eventsMod.foo` */
  override def _to: DurandalEventModule = ^
}
