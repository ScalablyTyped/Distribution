package typings.eggJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Egg.js is a simple JS library that has no prerequisites and allows you to easily add web easter
    * eggs by watching the user's key strokes.
    */
  @JSGlobal("Egg")
  @js.native
  /**
    * Egg.js is a simple JS library that has no prerequisites and allows you to easily add web easter
    * eggs by watching the user's key strokes.
    */
  class Egg_ () extends Egg {
    /**
      * Egg.js is a simple JS library that has no prerequisites and allows you to easily add web easter
      * eggs by watching the user's key strokes.
      * @param keySequence You need to pass it the character sequence to trigger the easter egg
      *                    callback (which can either be in plain English or JavaScript key codes).
      * @param fn A function to trigger when it happens.
      */
    def this(keySequence: String, fn: js.Function0[_]) = this()
    /**
      * Egg.js is a simple JS library that has no prerequisites and allows you to easily add web easter
      * eggs by watching the user's key strokes.
      * @param keySequence You need to pass it the character sequence to trigger the easter egg
      *                    callback (which can either be in plain English or JavaScript key codes).
      * @param fn A function to trigger when it happens.
      * @param metadata An optional set of metadata.
      */
    def this(keySequence: String, fn: js.Function0[_], metadata: js.Any) = this()
  }
  
  @JSGlobal("egg")
  @js.native
  def egg: Egg = js.native
  @scala.inline
  def egg_=(x: Egg): Unit = js.Dynamic.global.updateDynamic("egg")(x.asInstanceOf[js.Any])
}
