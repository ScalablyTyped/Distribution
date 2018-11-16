package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Application extends js.Object {
  /** The number of achievements visible to the currently authenticated player. */
  var achievement_count: js.UndefOr[scala.Double] = js.undefined
  /** The assets of the application. */
  var assets: js.UndefOr[js.Array[ImageAsset]] = js.undefined
  /** The author of the application. */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /** The category of the application. */
  var category: js.UndefOr[ApplicationCategory] = js.undefined
  /** The description of the application. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A list of features that have been enabled for the application.
               * Possible values are:
               * - "SNAPSHOTS" - Snapshots has been enabled
               */
  var enabledFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The ID of the application. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The instances of the application. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#application. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The last updated timestamp of the application. */
  var lastUpdatedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The number of leaderboards visible to the currently authenticated player. */
  var leaderboard_count: js.UndefOr[scala.Double] = js.undefined
  /** The name of the application. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A hint to the client UI for what color to use as an app-themed color. The color is given as an RGB triplet (e.g. "E0E0E0"). */
  var themeColor: js.UndefOr[java.lang.String] = js.undefined
}

