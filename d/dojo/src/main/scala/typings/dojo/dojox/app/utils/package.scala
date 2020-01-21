package typings.dojo.dojox.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utils {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/model.html
    *
    * model is called to create all of the models for the app, and all models for a view, it will
    * create and call the appropriate model utility based upon the modelLoader set in the model in the config
    * Called for each view or for the app.  For each model in the config, it willcreate the model utility based upon the modelLoader and call it to create and load the model.
    *
    * @param config The models section of the config for this view or for the app.
    * @param parent The parent of this view or the app itself, so that models from the parent will be available to the view.
    * @param app
    */
  type model = js.Function3[/* config */ js.Object, /* parent */ js.Object, /* app */ js.Object, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/mvcModel.html
    *
    * mvcModel is called for each mvc model, to create the mvc model based upon the type and params.
    * It will also load models and return the either the loadedModels or a promise.
    * Called for each model with a modelLoader of "dojox/app/utils/mvcModel", it will
    * create the model based upon the type and the params set for the model in the config.
    *
    * @param config The models section of the config for this view or for the app.
    * @param params The params set into the config for this model.
    * @param item The String with the name of this model
    */
  type mvcModel = js.Function3[
    /* config */ js.Object, 
    /* params */ js.Object, 
    /* item */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/nls.html
    *
    * nsl is called to create to load the nls all for the app, or for a view.
    *
    * @param config The section of the config for this view or for the app.
    * @param parent The parent of this view or the app itself, so that models from the parent will beavailable to the view.
    */
  type nls = js.Function2[/* config */ js.Object, /* parent */ js.Object, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/simpleModel.html
    *
    * simpleModel is called for each simple model, to create the simple model from the DataStore
    * based upon the store and query params.
    * It will also load models and return the either the loadedModels or a promise.
    * Called for each model with a modelLoader of "dojox/app/utils/simpleModel", it will
    * create the model based upon the store and query params set for the model in the config.
    *
    * @param config The models section of the config for this view or for the app.
    * @param params The params set into the config for this model.
    * @param item The String with the name of this model
    */
  type simpleModel = js.Function3[
    /* config */ js.Object, 
    /* params */ js.Object, 
    /* item */ java.lang.String, 
    scala.Unit
  ]
}
