package typings
package expressDashBruteDashMongoLib.expressDashBruteDashMongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary MongoDB store adapter.
  */
@JSImport("express-brute-mongo", JSImport.Namespace)
@js.native
class ^ protected () extends MongoStore {
  def this(getCollection: js.Function1[
      /* collection */ js.Function1[/* c */ mongodbLib.mongodbMod.Collection[mongodbLib.Default], scala.Unit], 
      scala.Unit
    ]) = this()
  def this(getCollection: js.Function1[
      /* collection */ js.Function1[/* c */ mongodbLib.mongodbMod.Collection[mongodbLib.Default], scala.Unit], 
      scala.Unit
    ], options: js.Object) = this()
}

