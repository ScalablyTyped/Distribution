package typings.atEmberRouting.routerMod

import typings.atEmberRouting.dashPrivateTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : EmberObject.extend(Evented) * / any */ @js.native
trait Router extends js.Object {
  /**
    * The `location` property determines the type of URL's that your
    * application will use.
    */
  var location: String = js.native
  /**
    * Represents the URL of the root of the application, often '/'. This prefix is
    * assumed on all routes defined on this router.
    */
  var rootURL: String = js.native
  /**
    * Handles updating the paths and notifying any listeners of the URL
    * change.
    */
  def didTransition(): js.Any = js.native
  /**
    * Transition the application into another route. The route may
    * be either a single route or route path:
    */
  def transitionTo(name: String): Transition = js.native
  def transitionTo(name: String, models: js.Any*): Transition = js.native
  def transitionTo(name: String, options: js.Object): Transition = js.native
  /**
    * Handles notifying any listeners of an impending URL
    * change.
    */
  def willTransition(): js.Any = js.native
}

