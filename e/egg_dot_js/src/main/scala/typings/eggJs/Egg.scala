package typings.eggJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Egg.js is a simple JS library that has no prerequisites and allows you to easily add web easter
  * eggs by watching the user's key strokes.
  */
@js.native
trait Egg extends js.Object {
  /**
    * Use to add in your easter eggs.
    * @param keySequence You need to pass it the character sequence to trigger the easter egg
    *                    callback (which can either be in plain English or JavaScript key codes).
    * @param fn A function to trigger when it happens.
    */
  def AddCode(keySequence: String, fn: js.Function0[_]): Egg = js.native
  /**
    * Use to add in your easter eggs.
    * @param keySequence You need to pass it the character sequence to trigger the easter egg
    *                    callback (which can either be in plain English or JavaScript key codes).
    * @param fn A function to trigger when it happens.
    * @param metadata An optional set of metadata.
    */
  def AddCode(keySequence: String, fn: js.Function0[_], metadata: js.Any): Egg = js.native
  /**
    * Add a hook, that will run after any egg code is triggered. You could use it to fire a Google
    * Analytics event or send out a tweet that someone finally found your easter egg. Hooks get
    * access to the whole Egg.js object so you can pull information about the easter egg that
    * fired via this.activeEgg.
    * @param fn A function to trigger when it happens.
    */
  def AddHook(fn: js.Function0[_]): Egg = js.native
  /**
    * Start listening to key codes.
    */
  def Listen(): Egg = js.native
  /**
    * Use to add in your easter eggs.
    * @param keySequence You need to pass it the character sequence to trigger the easter egg
    *                    callback (which can either be in plain English or JavaScript key codes).
    * @param fn A function to trigger when it happens.
    */
  def addCode(keySequence: String, fn: js.Function0[_]): Egg = js.native
  /**
    * Use to add in your easter eggs.
    * @param keySequence You need to pass it the character sequence to trigger the easter egg
    *                    callback (which can either be in plain English or JavaScript key codes).
    * @param fn A function to trigger when it happens.
    * @param metadata An optional set of metadata.
    */
  def addCode(keySequence: String, fn: js.Function0[_], metadata: js.Any): Egg = js.native
  /**
    * Add a hook, that will run after any egg code is triggered. You could use it to fire a Google
    * Analytics event or send out a tweet that someone finally found your easter egg. Hooks get
    * access to the whole Egg.js object so you can pull information about the easter egg that
    * fired via this.activeEgg.
    * @param fn A function to trigger when it happens.
    */
  def addHook(fn: js.Function0[_]): Egg = js.native
  /**
    * Start listening to key codes.
    */
  def listen(): Egg = js.native
}

