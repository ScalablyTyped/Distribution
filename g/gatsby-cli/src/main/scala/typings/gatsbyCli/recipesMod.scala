package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipesMod {
  
  @JSImport("gatsby-cli/lib/recipes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def recipesHandler(projectRoot: String, recipe: String, develop: Boolean, install: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recipesHandler")(projectRoot.asInstanceOf[js.Any], recipe.asInstanceOf[js.Any], develop.asInstanceOf[js.Any], install.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def recipesHandler(projectRoot: String, recipe: Unit, develop: Boolean, install: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recipesHandler")(projectRoot.asInstanceOf[js.Any], recipe.asInstanceOf[js.Any], develop.asInstanceOf[js.Any], install.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
