package typings.glob.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobStatic
  extends EventEmitter
     with Instantiable1[/* pattern */ String, IGlob]
     with Instantiable2[
      /* pattern */ String, 
      (/* cb */ js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]) | (/* options */ IOptions), 
      IGlob
    ]
     with Instantiable3[
      /* pattern */ String, 
      /* options */ IOptions, 
      /* cb */ js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit], 
      IGlob
    ]

