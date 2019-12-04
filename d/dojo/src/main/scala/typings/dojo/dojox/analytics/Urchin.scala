package typings.dojo.dojox.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/analytics/Urchin.html
  *
  * A Google-analytics helper, for post-onLoad inclusion of the tracker, and
  * dynamic tracking during long-lived page cycles.
  * A small class object will allows for lazy-loading the Google Analytics API
  * at any point during a page lifecycle. Most commonly, Google-Analytics is loaded
  * via a synchronous script tag in the body, which causes dojo.addOnLoad to
  * stall until the external API has been completely loaded. The Urchin helper
  * will load the API on the fly, and provide a convenient API to use, wrapping
  * Analytics for Ajaxy or single page applications.
  *
  * The class can be instantiated two ways: Programatically, by passing an
  * acct: parameter, or via Markup / dojoType and defining a djConfig
  * parameter urchin:
  *
  * IMPORTANT:
  * This module will not work simultaneously with the core dojox.analytics
  * package. If you need the ability to run Google Analytics AND your own local
  * analytics system, you MUST include dojox.analytics._base BEFORE dojox.analytics.Urchin
  *
  * @param args
  */
@JSGlobal("dojox.analytics.Urchin")
@js.native
class Urchin protected () extends js.Object {
  def this(args: js.Any) = this()
  /**
    * your GA urchin tracker account number. Overrides djConfig.urchin
    *
    */
  var acct: String = js.native
  /**
    * Stub function to fire when urchin is complete
    * This function is executed when the tracker variable is
    * complete and initialized. The initial trackPageView (with
    * no arguments) is called here as well, so remeber to call
    * manually if overloading this method.
    *
    */
  def GAonLoad(): Unit = js.native
  /**
    * A public API attached to this widget instance, allowing you
    * Ajax-like notification of updates.
    *
    * @param url A location to tell the tracker to track, eg: "/my-ajaxy-endpoint"
    */
  def trackPageView(url: String): Unit = js.native
}

