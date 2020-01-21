package typings.dojo.dojox.css3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transition {
  /**
    * The callback which will be called right after the end
    * of the transition effect and before the final state is
    * cleared.
    *
    */
  type beforeClear = js.Function0[scala.Unit]
  /**
    * The callback which will be called right before the start
    * of the transition effect.
    *
    */
  type beforeStart = js.Function0[scala.Unit]
  /**
    * The method which plays multiple transitions one by one.
    *
    * @param args The array of transition objects which will be played in a chain.
    */
  type chainedPlay = js.Function1[/* args */ js.Array[js.Any], scala.Unit]
  /**
    * Method to clear the state after a transition.
    *
    */
  type clear = js.Function0[scala.Unit]
  /**
    * Method which is used to create the transition object of fade effect.
    *
    * @param node The node that the fade transition effect will be applied on.
    * @param config The cofig arguments which will be mixed into this transition object.
    */
  type fade = js.Function2[/* node */ js.Any, /* config */ js.Any, scala.Unit]
  /**
    * Method which is used to create the transition object of flip effect.
    *
    * @param node The node that the flip transition effect will be applied on.
    * @param config The cofig arguments which will be mixed into this transition object.
    */
  type flip = js.Function2[/* node */ js.Any, /* config */ js.Any, scala.Unit]
  /**
    *
    * @param nodes
    */
  type getWaitingList = js.Function1[/* nodes */ js.Array[js.Any], js.Any]
  /**
    * The method which groups multiple transitions and plays
    * them together.
    *
    * @param args The array of transition objects which will be played together.
    */
  type groupedPlay = js.Function1[/* args */ js.Array[js.Any], js.Any]
  /**
    * Method to initialize the state for a transition.
    *
    */
  type initState = js.Function0[scala.Unit]
  /**
    * Plays the transition effect defined by this transition object.
    *
    */
  type play = js.Function0[scala.Unit]
  /**
    * Method which is used to create the transition object of a slide effect.
    *
    * @param node The node that the slide transition effect will be applied on.
    * @param config The cofig arguments which will be mixed into this transition object.
    */
  type slide = js.Function2[/* node */ js.Any, /* config */ js.Any, scala.Unit]
  /**
    * Method to start the transition.
    *
    */
  type start = js.Function0[scala.Unit]
}
