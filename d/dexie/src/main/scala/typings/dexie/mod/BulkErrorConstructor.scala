package typings.dexie.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkErrorConstructor
  extends StObject
     with Instantiable0[BulkError]
     with Instantiable1[/* msg */ String, BulkError]
     with Instantiable2[
      (/* msg */ String) | (/* msg */ Unit), 
      /* failures */ NumberDictionary[js.Error], 
      BulkError
    ]
