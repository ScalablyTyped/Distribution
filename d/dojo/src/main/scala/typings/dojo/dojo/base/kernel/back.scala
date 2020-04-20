package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.back.html
  *
  * Browser history management resources
  *
  */
trait back extends js.Object {
  /**
    * adds a state object (args) to the history list.
    * To support getting back button notifications, the object
    * argument should implement a function called either "back",
    * "backButton", or "handle". The string "back" will be passed as
    * the first and only argument to this callback.
    *
    * To support getting forward button notifications, the object
    * argument should implement a function called either "forward",
    * "forwardButton", or "handle". The string "forward" will be
    * passed as the first and only argument to this callback.
    *
    * If you want the browser location string to change, define "changeUrl" on the object. If the
    * value of "changeUrl" is true, then a unique number will be appended to the URL as a fragment
    * identifier (http://some.domain.com/path#uniquenumber). If it is any other value that does
    * not evaluate to false, that value will be used as the fragment identifier. For example,
    * if changeUrl: 'page1', then the URL will look like: http://some.domain.com/path#page1
    *
    * There are problems with using dojo/back with semantically-named fragment identifiers
    * ("hash values" on an URL). In most browsers it will be hard for dojo/back to know
    * distinguish a back from a forward event in those cases. For back/forward support to
    * work best, the fragment ID should always be a unique value (something using new Date().getTime()
    * for example). If you want to detect hash changes using semantic fragment IDs, then
    * consider using dojo/hash instead (in Dojo 1.4+).
    *
    * @param args The state object that will be added to the history list.
    */
  def addToHistory(args: js.Object): Unit
  /**
    *
    */
  def getHash(): js.Any
  /**
    * private method. Do not call this directly.
    *
    */
  def goBack(): Unit
  /**
    * private method. Do not call this directly.
    *
    */
  def goForward(): Unit
  /**
    * Initializes the undo stack. This must be called from a
    * block that lives inside the <code>&lt;body&gt;</code> tag to prevent bugs on IE.
    * </p>
    * <p>Only call this method before the page&#39;s DOM is finished loading. Otherwise
    * it will not work. Be careful with xdomain loading or djConfig.debugAtAllCosts scenarios,
    * in order for this method to work, dojo/back will need to be part of a build layer.</p>
    * </div>
    *       </div>
    *       <div class="jsdoc-field extension-module">
    *         <div class="jsdoc-title"><a name="1_9dojo__base_kernel_back_setHash"></a><span class="functionIcon">setHash</span><span class="parameters">(h)</span>
    *         </div>
    *         <div class="jsdoc-inheritance">Defined by <a href="/api/1.9/dojo/back" class="jsdoc-link">dojo/back</a><span title="Must manually require () dojo/back to access" class="jsdoc-extension"></span>
    *         </div>
    *         <div class="jsdoc-full-summary"></div>
    *         <table class="jsdoc-parameters">
    *           <tr>
    *             <th>Parameter</th>
    *             <th>Type</th>
    *             <th>Description</th>
    *           </tr>
    *           <tr>
    *             <td class="jsdoc-param-name">h</td>
    *             <td class="jsdoc-param-type">undefined</td>
    *             <td class="jsdoc-param-description">
    *             </td>
    *           </tr>
    *         </table>
    *       </div>
    *       <div class="jsdoc-field extension-module">
    *         <div class="jsdoc-title"><a name="1_9dojo__base_kernel_back_setInitialState"></a><span class="functionIcon">setInitialState</span><span class="parameters">(args)</span>
    *         </div>
    *         <div class="jsdoc-inheritance">Defined by <a href="/api/1.9/dojo/back" class="jsdoc-link">dojo/back</a><span title="Must manually require () dojo/back to access" class="jsdoc-extension"></span>
    *         </div>
    *         <div class="jsdoc-full-summary"><p>Sets the state object and back callback for the very first page
    * that is loaded.
    * </p>
    * <p>It is recommended that you call this method as part of an event
    * listener that is registered via dojo/ready.</p>
    * </div>
    *         <table class="jsdoc-parameters">
    *           <tr>
    *             <th>Parameter</th>
    *             <th>Type</th>
    *             <th>Description</th>
    *           </tr>
    *           <tr>
    *             <td class="jsdoc-param-name">args</td>
    *             <td class="jsdoc-param-type">Object</td>
    *             <td class="jsdoc-param-description"><p>See the addToHistory() function for the list of valid args properties.</p>
    *
    *             </td>
    *           </tr>
    *         </table>
    *       </div>
    *     </div>
    *   </div>
    * </div><a href="https://docs.google.com/spreadsheet/viewform?hl=en_US&amp;formkey=dFlDcHEyaHMwbEd4MFBObkNrX0E1MFE6MQ&amp;entry_0=/api/1.9/dojo/_base/kernel.back" class="feedback">Error in the documentation? Can't find what you are looking for? Let us know!</a>
    */
  def init(): Unit
}

object back {
  @scala.inline
  def apply(
    addToHistory: js.Object => Unit,
    getHash: () => js.Any,
    goBack: () => Unit,
    goForward: () => Unit,
    init: () => Unit
  ): back = {
    val __obj = js.Dynamic.literal(addToHistory = js.Any.fromFunction1(addToHistory), getHash = js.Any.fromFunction0(getHash), goBack = js.Any.fromFunction0(goBack), goForward = js.Any.fromFunction0(goForward), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[back]
  }
}

