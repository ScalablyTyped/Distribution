package typings.gherkin

import typings.gherkin.anon.DefaultDialect
import typings.gherkin.igherkinoptionsMod.IGherkinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeGherkinOptionsMod {
  
  @JSImport("gherkin/dist/src/makeGherkinOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: IGherkinOptions): DefaultDialect = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[DefaultDialect]
}
