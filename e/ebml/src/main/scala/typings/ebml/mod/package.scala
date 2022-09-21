package typings.ebml.mod

import typings.ebml.ebmlStrings.end
import typings.ebml.ebmlStrings.start
import typings.ebml.ebmlStrings.tag
import typings.ebml.mod.^
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def schema: Map[Double, EBMLTagSchema] = ^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[Map[Double, EBMLTagSchema]]

type StateAndTagData = js.Tuple2[tag | start | end, Tag[Any] | TagMetadata]
