package typings.googleAnalytics

import typings.googleAnalytics.UniversalAnalytics.ga
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Tracker")
  @js.native
  class Tracker ()
    extends StObject
       with typings.googleAnalytics.Tracker
  
  @JSGlobal("ga")
  @js.native
  def ga: typings.googleAnalytics.UniversalAnalytics.ga = js.native
  
  @JSGlobal("gaClassic")
  @js.native
  def gaClassic: GoogleAnalytics = js.native
  @scala.inline
  def gaClassic_=(x: GoogleAnalytics): Unit = js.Dynamic.global.updateDynamic("gaClassic")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ga_=(x: ga): Unit = js.Dynamic.global.updateDynamic("ga")(x.asInstanceOf[js.Any])
  
  @JSGlobal("_gaq")
  @js.native
  def gaq: GoogleAnalyticsCode = js.native
  
  @scala.inline
  def gaq_=(x: GoogleAnalyticsCode): Unit = js.Dynamic.global.updateDynamic("_gaq")(x.asInstanceOf[js.Any])
  
  @JSGlobal("_gat")
  @js.native
  def gat: GoogleAnalyticsTracker = js.native
  
  @scala.inline
  def gat_=(x: GoogleAnalyticsTracker): Unit = js.Dynamic.global.updateDynamic("_gat")(x.asInstanceOf[js.Any])
}
