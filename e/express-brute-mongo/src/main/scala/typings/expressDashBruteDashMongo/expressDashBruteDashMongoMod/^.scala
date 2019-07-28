package typings.expressDashBruteDashMongo.expressDashBruteDashMongoMod

import typings.mongodb.Default
import typings.mongodb.mongodbMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary MongoDB store adapter.
  */
@JSImport("express-brute-mongo", JSImport.Namespace)
@js.native
class ^ protected () extends MongoStore {
  def this(getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[Default], Unit], Unit]) = this()
  def this(
    getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[Default], Unit], Unit],
    options: js.Object
  ) = this()
}

