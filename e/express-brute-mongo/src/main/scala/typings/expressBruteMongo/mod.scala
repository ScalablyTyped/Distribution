package typings.expressBruteMongo

import typings.mongodb.mod.Collection
import typings.mongodb.mod.DefaultSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @summary MongoDB store adapter.
    */
  @JSImport("express-brute-mongo", JSImport.Namespace)
  @js.native
  class ^ protected () extends MongoStore {
    def this(getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[DefaultSchema], Unit], Unit]) = this()
    def this(
      getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[DefaultSchema], Unit], Unit],
      options: js.Object
    ) = this()
  }
  
  /**
    * @summary MongoDB store adapter.
    */
  @js.native
  trait MongoStore extends StObject
}
