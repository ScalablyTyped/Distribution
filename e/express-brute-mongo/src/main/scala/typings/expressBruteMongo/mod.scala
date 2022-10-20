package typings.expressBruteMongo

import typings.bson.mod.Document
import typings.mongodb.mod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @summary MongoDB store adapter.
    */
  @JSImport("express-brute-mongo", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MongoStore {
    def this(getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[Document], Unit], Unit]) = this()
    def this(
      getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[Document], Unit], Unit],
      options: js.Object
    ) = this()
  }
  
  /**
    * @summary MongoDB store adapter.
    */
  trait MongoStore extends StObject
}
