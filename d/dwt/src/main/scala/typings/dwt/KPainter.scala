package typings.dwt

import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.MediaStreamConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KPainter extends js.Object {
  /**
    The image whose width or height larger than`addedImageMaxWH` would be compressed when adding.
    
    * Syntax:* `.addedImageMaxWH = 4096;`
    */
  var addedImageMaxWH: Double = js.native
  /**
    * Whether allow switch from last to first or from first to last by`touchmove` gesture.
    
    * Syntax:* `.allowedTouchMoveSwitchImgOverBoundary = true;`
    */
  var allowedTouchMoveSwitchImgOverBoundary: Boolean = js.native
  /**
    `Crop Rect` min height.
    
    * Syntax:* `.cropRectMinH = 50;`
    */
  var cropRectMinH: Double = js.native
  /**
    *     `Crop Rect` min width.
    
    * Syntax:* `.cropRectMinW = 50;`
    */
  var cropRectMinW: Double = js.native
  /**
    * @example
  ```javascript
  // warning: never redefine it if you are not sure
  // painter.defaultFileInput = document.createElement('input');
  painter.defaultFileInput.accept = "image/png";
  painter.defaultFileInput.multiple = false;
  ```
    */
  var defaultFileInput: HTMLInputElement = js.native
  /**
    *     
    * `freeTransformAsync()` is a really expensive operation. `freeTransformMaxWH` would limit the max width and height of the result.
    
    * Syntax:* `.freeTransformMaxWH = 2048;`
    */
  var freeTransformMaxWH: Double = js.native
  // # Crop
  /**
    * Whether show`Crop Rect` UI when enter`Editing` mode
    
    * Syntax:* `.isAutoShowCropUI = true;`
    */
  var isAutoShowCropUI: Boolean = js.native
  /**
    * Whether`changePage` to the new added image.
    
    * Syntax:* `.isShowNewImgWhenAdd = true;`
    */
  var isShowNewImgWhenAdd: Boolean = js.native
  // # Gesture
  /**
    * 
    Set the zoom rate when user left double click.
    
    * Syntax:* `.leftDoubleClickZoomRate = 2;`
    
    */
  var leftDoubleClickZoomRate: Double = js.native
  /**
    * Set the zoom rate when user right double click.
    
    * Syntax:* `.rightDoubleClickZoomRate = 0.5;`
    */
  var rightDoubleClickZoomRate: Double = js.native
  // # Basic Editor
  /**
    * The can - not - store step(freeTransform, brush) will generate a step image.If the step images' count over `stepImgsGCThreshold`, oldest not protected one would be GC.
    
    * Syntax:* `.stepImgsGCThreshold = 10;`
    */
  var stepImgsGCThreshold: Double = js.native
  // # Video
  var videoSettings: MediaStreamConstraints = js.native
  def addImageAsync(imgData: String): Unit = js.native
  def addImageAsync(imgData: String, callback: js.Function0[Unit]): Unit = js.native
  def addImageAsync(imgData: js.Array[String]): Unit = js.native
  def addImageAsync(imgData: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Syntax:* `.addImageAsync(imgData, callback)`
    
    | parameter | type | description |
    |  |  |  |
    | imgData | `Blob`, `HTMLCanvasElement`, `HTMLImageElement`, `String` * (url) *, `Array` * (a array of source)*, `FileList` | |
    | callback * (optional) * | `function(bSuccess)` | |
    
    @example
  ```javascript
  painter.addImageAsync(image, function(bSuccess){
    console.log('Add success');
  });
  ```
    */
  def addImageAsync(imgData: Blob): Unit = js.native
  def addImageAsync(imgData: Blob, callback: js.Function0[Unit]): Unit = js.native
  def addImageAsync(imgData: HTMLCanvasElement): Unit = js.native
  def addImageAsync(imgData: HTMLCanvasElement, callback: js.Function0[Unit]): Unit = js.native
  def addImageAsync(imgData: HTMLImageElement): Unit = js.native
  def addImageAsync(imgData: HTMLImageElement, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Add a protected step.Then this step would not be GC.Can only process in `Editing` mode.
    
    * Syntax:* `.addProtectedStep(index)`
    
    | parameter | type | description |
    |  |  |  |
    | index | `Number` | |
    
    @example
  ```javascript
    // sample code: save and give up editing about freeTransform mode 
  document.getElementById('btn-enterFreeTransformMode').addEventListener('click', function(){
    // pretect step when enter freeTransform mode
    painter.addProtectedStep(painter.getCurStep());
    // presume that `MBC.loadCvScriptAsync(callback)` has been called and success
    painter.enterFreeTransformModeAsync();
  });
    
  document.getElementById('btn-saveFreeTransform').addEventListener('click', function(){
    // remove the the last pretect step
    var protectedSteps = painter.getProtectedSteps();
    painter.removeProtectedStep(protectedSteps[protectedSteps.length - 1]);
    // transform and exitFreeTransformMode
    painter.freeTransformAsync(function(){
    painter.exitFreeTransformModeAsync();
    });
  });
    
  document.getElementById('btn-giveUpFreeTransform').addEventListener('click', function(){
    // pretect step when enter freeTransform mode
    var protectedSteps = painter.getProtectedSteps();
    var lastPretectedStep = protectedSteps[protectedSteps.length - 1];
    // remove the the last pretect step
    painter.removeProtectedStep(lastPretectedStep);
    // exitFreeTransformMode
    painter.exitFreeTransformModeAsync(function(){
    // jump to the last pretect step
    painter.setCurStepAsync(lastPretectedStep);
    });
  });
  ```
    */
  def addProtectedStep(index: Double): Boolean = js.native
  /**
    * 
    * Syntax:* `function(){}`
    
    @example
  ```javascript
  painter.afterAddImgFromDropFile = function(bSuccess){
    if(bSuccess){console.log('The new image(s) has been added from dropping.');}
  };
  ```
    * 
    */
  def afterAddImgFromDropFile(): Unit = js.native
  /**
    * Binding a function that would be called after adding image from`defaultFileInput`.
    
    * Syntax:* `function(){}`
    
    @example
  ```javascript
  painter.afterAddImgFromFileChooseWindow = function(bSuccess){
    if(bSuccess){console.log('The new image(s) has been added from file choose window.');}
  };
  ```
    */
  def afterAddImgFromFileChooseWindow(): Unit = js.native
  /**
    * Syntax:* `function(){}`
    
    @example
  ```javascript
  painter.afterAddImgFromGrabVideoBtn = function(bSuccess){
    if(bSuccess){console.log('The new image(s) has been added from video.');}
  };
  ```
    */
  def afterAddImgFromGrabVideoBtn(): Unit = js.native
  /*** 
    * Syntax:* `function(event, callback){}`    
    @example
  ```javascript
  painter.beforeAddImgFromDropFile = function(ev, callback){
    var files = ev.dataTransfer.files;
    var newBlobs = [];
    var finishedIndex = 0;
    for(var i = 0; i < files.length; ++i){
    var file = files[i];
    doSomeWorkToGetANewBlob(file, function(blob){
    newBlobs.push(blob);
    if(files.length == ++finishedIndex){
    callback(newBlobs);
    }
    });
    }
  };
  ```
    */
  def beforeAddImgFromDropFile(): js.Any = js.native
  /**
    * Binding a function that would be called when`defaultFileInput` change by`showFileChooseWindow()`.
    
    * Syntax:* `function(event, callback){}`
    
    @example
  ```javascript
  painter.beforeAddImgFromFileChooseWindow = function(ev, callback){
    var files = ev.target.files;
    var newBlobs = [];
    var finishedIndex = 0;
    for(var i = 0; i < files.length; ++i){
    var file = files[i];
    doSomeWorkToGetANewBlob(file, function(blob){
    newBlobs.push(blob);
    if(files.length == ++finishedIndex){
    callback(newBlobs);
    }
    });
    }
  };
  ```
    */
  def beforeAddImgFromFileChooseWindow(): Unit = js.native
  /**
    * Syntax:* `function(canvas, callback){}`
    
    @example
  ```javascript
  painter.beforeAddImgFromGrabVideoBtn = function(canvas, callback){
    doSomeWorkToGetNewSrc(canvas, function(srcValidForAddImage){
    callback(srcValidForAddImage);
    });
  };
  ```
    */
  def beforeAddImgFromGrabVideoBtn(): Unit = js.native
  /**
    * Syntax:* `.bindThumbnailBox(container, funWrap, maxWH)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    | container | `HTMLElement` | |
    | funWrap * (optional) * | `HTMLElement function(HTMLCanvasElement cvs)` | |
    | maxWH * (optional) * | `Number` | Default 256. |
    
    @example
  ```javascript
  painter.bindThumbnailBox(document.getElementById('div-thumbnailContainer'), function(cvs){
    console.log(cvs.className);// 'kPainterThumbnailCanvas', never remove this class
    var box = document.createElement('div');
    box.className = 'div-thumbnailBox';
    box.appendChild(cvs);
    box.addEventListener('click', function(){
    var idx = box.getKPainterIndex();// get index
    painter.changePage(idx);
    });
    return box;
  });
  ```
    */
  def bindThumbnailBox(container: HTMLElement): Boolean = js.native
  def bindThumbnailBox(container: HTMLElement, funWrap: js.Function0[HTMLElement]): Boolean = js.native
  def bindThumbnailBox(container: HTMLElement, funWrap: js.Function0[HTMLElement], maxWH: Double): Boolean = js.native
  /**
    * Leave the`Editing` mode without saving change.
    
    * Syntax:* `.cancelEdit(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    */
  def cancelEdit(callback: js.Function0[Unit]): Boolean = js.native
  def changePage(cmd: String): Boolean = js.native
  /**
    * Change index of the current page.Can only process in `Viewing` mode.
    
    * Syntax:* `.changePage(cmd)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    | cmd | `Number` * (index) *, `String` * ('f', 'p', 'n', 'l') * | Index number, or command string of 'f'(first), 'p'(pre), 'n'(next), 'l'(last). |
    
    @example
  ```javascript
  document.getElementById('btn-first').addEventListener('click', function(){
    painter.changePage('f');
  });
  document.getElementById('btn-pre').addEventListener('click', function(){
    painter.changePage('p');
  });
  document.getElementById('btn-next').addEventListener('click', function(){
    painter.changePage('n');
  });
  document.getElementById('btn-last').addEventListener('click', function(){
    painter.changePage('l');
  });
  document.getElementById('btn-toThisPage').addEventListener('click', function(){
    painter.changePage(parseInt(document.getElementById('ipt-page').value));
  });
  ```
    */
  def changePage(cmd: Double): Boolean = js.native
  /**
    * Crop the selected area.Can only process in `Editing` mode.
    
    * Syntax:* `.cropAsync(callback, array)`
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function([left, top, right, bottom])` | |
    | array * (optional) * | `Array` | A array of[left, top, right, bottom]\(each - 0.5 ~0.5\).Default use an area accroding to`Crop Rect`. |
    
    */
  def cropAsync(): Unit = js.native
  def cropAsync(callback: js.Function0[Unit]): Unit = js.native
  def cropAsync(callback: js.Function0[Unit], array: js.Array[rectangle]): Unit = js.native
  /**
    * Delete a image.Can only process in `Viewing` mode.
    
    * Syntax:* `.del(index)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    | index * (optional) * | `Number` | Default current index. |
    
    */
  def del(index: Double): Boolean = js.native
  // # Free Transform
  /**
    * You should call`KPainter.loadCvScriptAsync()` first before use`FreeTransform` mode.
    */
  /**
    * Detect a document.Would auto call`setFreeTransformCornerPos()` after detected.Can only process in `FreeTransform` mode.
    
    * Syntax:* `.documentDetectAsync(callback, importSrc)`
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function([[x0,y0], [x1,y1], [x2,y2], [x3,y3]])` | x0, y0...is from - 0.5 to 0.5. |
    | importSrc * (optional) * | | TUDO.Not easy enough to use now. |
    */
  def documentDetectAsync(): Unit = js.native
  def documentDetectAsync(callback: js.Function0[Unit]): Unit = js.native
  def documentDetectAsync(callback: js.Function0[Unit], importSrc: js.Any): Unit = js.native
  /**
    * Download the image to users' local system. The function should be invoked directly by the user. Async invoking may have problems.
    
    * Syntax:* `.download(filename, index)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    | filename * (optional) * | `String` | |
    | index * (optional) * | `Number` | Default current index. |
    
    @example
  ```javascript
  document.getElementById('btn-download').addEventListener('click', function(){
    for(var i = 0; i < painter.getCount(); ++i){
    painter.download(null, i);
    }
  });
  ```
    */
  def download(): Double = js.native
  def download(filename: String): Double = js.native
  def download(filename: String, index: Double): Double = js.native
  /**
    * Enter the`Editing` mode.
    
    * Syntax:* `.enterEditAsync(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback | `function(boolean bSuccess)` | |
    */
  def enterEditAsync(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 
    Enter`FreeTransform` mode.Can only process in `Editing` mode.
    
    * Syntax:* `.enterFreeTransformModeAsync(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function(boolean bSuccess)` | |
    */
  def enterFreeTransformModeAsync(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Exist`FreeTransform` mode.
    
    * Syntax:* `.exitFreeTransformModeAsync(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function(boolean bSuccess)` | |
    */
  def exitFreeTransformModeAsync(): js.Any = js.native
  def exitFreeTransformModeAsync(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Flip.Can only process in `Editing` mode.
    
    * Syntax:* `.flip()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    */
  def flip(): Boolean = js.native
  /**
    * 
    Transform the quadrilateral surround by the`FreeTransform` corner into a rectangle.Can only process in `FreeTransform` mode.
    
    * Syntax:* `.freeTransformAsync(callback, cornerPoints, importSrc)`
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function(boolean bSuccess)` | |
    | cornerPoints * (optional) * | `Array` | A array of[[x0, y0], [x1, y1], [x2, y2], [x3, y3]].x0, y0...is from - 0.5 to 0.5. |
    | importSrc * (optional) * | | TUDO.Not show for user. |
    */
  def freeTransformAsync(): js.Any = js.native
  def freeTransformAsync(callback: js.Function0[Unit]): js.Any = js.native
  def freeTransformAsync(callback: js.Function0[Unit], cornerPoints: js.Array[cornerPoints]): js.Any = js.native
  def freeTransformAsync(callback: js.Function0[Unit], cornerPoints: js.Array[cornerPoints], importSrc: js.Any): js.Any = js.native
  /**
    * Get the image data in `Blob` type.
    
    * Syntax:* `.getBlob(index)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    | index * (optional) * | `Number` | Default current index. |
    */
  def getBlob(index: Double): Blob = js.native
  /**
    * Get the image count in a MBC instance.
    */
  def getCount(): Double = js.native
  /**
    * Syntax:* `.getCropRectArea(isAbsolute)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Array` | A array of[left, top, right, bottom]. |
    | isAbsolute | `boolean` | Default`false`, get precentage(-50 % ~50 %) array. |
    
    */
  def getCropRectArea(isAbsolute: Boolean): js.Array[rectangle] = js.native
  /**
    * Get the current showing image index a in MBC instance.
    */
  def getCurIndex(): Double = js.native
  /**
    * Get current editing step.Can only process in `Editing` mode.
    
    * Syntax:* `.getCurStep()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    */
  def getCurStep(): Double = js.native
  /**
    * Get height of current editing canvas.
    
    * Syntax:* `.getEditHeight()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    */
  def getEditHeight(): Double = js.native
  /**
    * Get width of current editing canvas.
    
    * Syntax:* `.getEditWidth()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    */
  def getEditWidth(): Double = js.native
  /**
    * Get the`FreeTransform` corner position.
    
    * Syntax:* `.getFreeTransformCornerPos()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Array` | A array of[[x0, y0], [x1, y1], [x2, y2], [x3, y3]].x0, y0...is from - 0.5 to 0.5.|
    
    */
  def getFreeTransformCornerPos(): js.Array[cornerPoints] = js.native
  /**
    * Get height of current image in the MBC instance.
    
    * Syntax:* `.getHeight(index)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    | index * (optional) * | `Number` | Default current index. |
    */
  def getHeight(index: Double): Double = js.native
  /**
    * @example    
  ```javascript
  var painterDom = painter.getHtmlElement();
  painterDom.style.width = '100%';
  painterDom.style.height = '100%';
  document.getElementById('painter-container').appendChild(painterDom);
  ```
    * 
    */
  def getHtmlElement(): HTMLDivElement = js.native
  /**
    *
  @example```javascript
  // A way to access to inner data. Don't modify it if you are not sure.
  var imgOri = painter.getImage(true);
  // This image can be used in any place and free to modify it.
  var imgCopyed = painter.getImage();
  imgCopyed.style.width = '100px';
  imgCopyed.style.height = '100px';
  document.getElementById('image-container').appendChild(imgCopyed);
  ```
    */
  def getImage(isOri: Boolean, index: Double): HTMLImageElement = js.native
  /**
    * Get All protected steps.Can only process in `Editing` mode.
    
    * Syntax:* `.getProtectedSteps()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Array` | A array of the protected numbers. |
    */
  def getProtectedSteps(): js.Array[Double] = js.native
  /**
    * Get count of editing steps.Can only process in `Editing` mode.
    
    * Syntax:* `.getStepCount()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    */
  def getStepCount(): Double = js.native
  /**
    * Get width of current image in the MBC instance.
    
    * Syntax:* `.getWidth(index)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    | index * (optional) * | `Number` | Default current index. |
    */
  def getWidth(index: Double): Double = js.native
  /**
    * Get the zoom of current image or canvas(in `Editing` mode).
    
    * Syntax:* `.getZoom()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | |
    */
  def getZoom(): Double = js.native
  /**
    * Syntax:* `.grabVideo()`
    
    Grab a image from the video and return the image.
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `HTMLCanvasElement` | |
    * Syntax:* `.grabVideo(true, callback)`
    
    Grab a image from the video and auto add image to the painter.Can only process in `Viewing` mode.
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function(boolean bSuccess)` | |
    */
  def grabVideo(): HTMLCanvasElement | Unit = js.native
  def grabVideo(isAutoAdd: Boolean): HTMLCanvasElement | Unit = js.native
  def grabVideo(isAutoAdd: Boolean, callback: js.Function0[Unit]): HTMLCanvasElement | Unit = js.native
  /**
    * Hide`Crop Rect`.Can only process in `Editing` mode.
    
    * Syntax:* `.hideCropRect()`
    */
  def hideCropRect(): Unit = js.native
  /**
    * Syntax:* `.hideVideo()`
    */
  def hideVideo(): Boolean = js.native
  /**
    * Identify whether the MBC instance is in `Editing` mode.
    */
  def isEditing(): Boolean = js.native
  /**
    * Mirror.Can only process in `Editing` mode.
    
    * Syntax:* `.mirror()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    */
  def mirror(): Boolean = js.native
  /**
    * Binding a function that would be called when the`Crop Rect` change.
    
    * Syntax:* `function(){}`
    
    @example
  ```javascript
  painter.onCropRectChange = function(){
    var cropArea = painter.getCropRectArea(true);
    document.getElementById('cropWidth').innerText = cropArea[2] - cropArea[0];
    document.getElementById('cropHeight').innerText = cropArea[3] - cropArea[1];
  };
  ```
    */
  def onCropRectChange(): Unit = js.native
  /**
    * Binding a function that would be called when finishing an expensive operation.
    
    * Syntax:* `function(){}`
    
    @example```javascript
    painter.onFinishLoading = function(){
    document.getElementById('animation').hide();
    };
    ```
    */
  def onFinishLoading(): Unit = js.native
  /**
    * Binding a function that would be called when the`FreeTransform` corner position change.
    
    * Syntax:* `function()`
    
    @example
  ```javascript
  painter.onFreeTransformCornerPosChange = function(){
    console.log(painter.getFreeTransformCornerPos());
  };
  ```
    */
  def onFreeTransformCornerPosChange(): Unit = js.native
  /**
    * Binding a function that would be called when current image index or total length change.
    
    * Syntax:* `function(Number curIndex, Number length){}`
    
    @example
  ```javascript
  painter.onNumChange = function(curIndex, length){
    console.log('curIndex: '+curIndex+', length:'+length);
  };
  ``` 
    */
  def onNumChange(curIndex: Double, length: Double): Unit = js.native
  /**
    * Binding a function that would be called when starting an expensive operation.    
    * Syntax:* `function(){}`    
  @example```javascript
  painter.onStartLoading = function(){
    document.getElementById('animation').show();
  };
  ```
    */
  def onStartLoading(): Unit = js.native
  /**
    * Binding a function that would be called when the performence of the current image or canvas(in `Editing` mode) update.
    
    * Syntax:* `function(){}`
    
    @example
  ```javascript
  painter.onUpdateImgPosZoom(function(){
    console.log(painter.getZoom());
    console.log(painter.getEditWidth());
    console.log(painter.getEditHeight());
  });
  ```
    */
  def onUpdateImgPosZoom(): Unit = js.native
  /**
    * Redo an editing step.Can only process in `Editing` mode.
    
    * Syntax:* `.redo(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback | `function(boolean bSuccess)` | |
    */
  def redo(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Remove a protected step.Then this step can be GC.Can only process in `Editing` mode.
    
    * Syntax:* `.removeProtectedStep(index)`
    
    | parameter | type | description |
    |  |  |  |
    | index | `Number` | |
    
    */
  def removeProtectedStep(index: Double): Boolean = js.native
  /**
    * Resize.Can only process in `Editing` mode.
    
    * Syntax:* `.resizeAsync(newWidth, newHeight, callback)`
    
    | parameter | type | description |
    |  |  |  |
    | newWidth | `Number` | |
    | newHeight | `Number` | |
    | callback | `function(boolean bSuccess)` | |
    */
  def resizeAsync(newWidth: Double, newHeight: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Rotate left.Can only process in `Editing` mode.
    
    * Syntax:* `.rotateLeft()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    */
  def rotateLeft(): Boolean = js.native
  /**
    * Rotate right.Can only process in `Editing` mode.
    
    * Syntax:* `.rotateRight()`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    */
  def rotateRight(): Boolean = js.native
  /**
    * Save change and leave the`Editing` mode.
    
    * Syntax:* `.saveEditAsync(callback, isCover)`
    
    | parameter | type | description |
    |  |  |  |
    | callback | `function(boolean bSuccess)` | |
    | isCover | `boolean` | |
    */
  def saveEditAsync(callback: js.Function0[Unit], isCover: Boolean): Unit = js.native
  /**
    * 
    * Syntax:* `.setCropRectArea(left, top, right, bottom)`
    `Crop Rect` select an area.
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    | left * (optional) * | `Number` | -0.5 ~0.5, default -0.5. |
    | top * (optional) * | `Number` | -0.5 ~0.5, default -0.5. |
    | right * (optional) * | `Number` | -0.5 ~0.5, default 0.5. |
    | bottom * (optional) * | `Number` | -0.5 ~0.5, default 0.5. |
    */
  def setCropRectArea(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Default 0.
    0: touch / click moving inside`Crop Rect` will move the back canvas.
    1: touch / click moving inside`Crop Rect` will move the`Crop Rect`.
    
    * Syntax:* `.setCropRectStyle(styleNo)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    | styleNo | `Number` | 0, 1 |
    */
  def setCropRectStyle(styleNo: Double): Boolean = js.native
  /**
    * Set current editing step.Can only process in `Editing` mode.
    
    * Syntax:* `.setCurStepAsync(index, callback)`
    
    | parameter | type | description |
    |  |  |  |
    | index | `Number` | |
    | callback | `function(boolean bSuccess)` | |
    */
  def setCurStepAsync(index: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Set the`FreeTransform` corner position.Can only process in `FreeTransform` mode.
    
    * Syntax:* `.setFreeTransformCornerPos(cornerPoints)`
    
    | parameter | type | description |
    |  |  |  |
    | cornerPoints | `Array` | A array of[[x0, y0], [x1, y1], [x2, y2], [x3, y3]].x0, y0...is from - 0.5 to 0.5. |
    
    */
  def setFreeTransformCornerPos(cornerPoints: cornerPoints): js.Any = js.native
  /**
    * Set the zoom of current image or canvas(in `Editing` mode).
    
    * Syntax:* `.setZoom(num, isRate)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `Number` | The finally effective zoom. |
    | num | `Number` | |
    | isRate | `boolean` | |
    */
  def setZoom(num: Double, isRate: Boolean): Double = js.native
  /**
    Show`Crop Rect`.Can only process in `Editing` mode.
    
    * Syntax:* `.showCropRect()`
    */
  def showCropRect(): Unit = js.native
  // # Image Store
  /**
    * Show file choose window by click the hidden file input.Can't process during `Editing` mode.
    * @example
  ```javascript
  document.getElementById('btn-add-image').addEventListener('click', function(){
    painter.showFileChooseWindow();
  });
  ```
    */
  def showFileChooseWindow(): Boolean = js.native
  // ## `MediaStreamConstraints`.videoSettings
  /**
    A[MediaStreamConstraints](https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamConstraints).
    
    * reference:* [getUserMedia](https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia)
    
    * Syntax:* `.showVideo(callback, videoSettings)`
    
    | parameter | type | description |
    |  |  |  |
    | callback * (optional) * | `function(boolean bSuccess)` | |
    | videoSettings * (optional) * | `MediaStreamConstraints` | A[MediaStreamConstraints](https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamConstraints). *reference:* [getUserMedia](https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia) |
    */
  def showVideo(): Boolean = js.native
  def showVideo(callback: js.Function0[Unit]): Boolean = js.native
  def showVideo(callback: js.Function0[Unit], videoSettings: MediaStreamConstraints): Boolean = js.native
  /**
    * Syntax:* `.unbindThumbnailBox(container)`
    
    | parameter | type | description |
    |  |  |  |
    | * (return value)* | `boolean` | |
    | container | `HTMLElement` | |
    
    @example
  ```javascript
  painter.bindThumbnailBox(document.getElementById('div-thumbnailContainer'));
  ```
    */
  def unbindThumbnailBox(container: HTMLElement): Boolean = js.native
  /**
    * Undo an editing step.Can only process in `Editing` mode.
    
    * Syntax:* `.undo(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback | `function(boolean bSuccess)` | |
    */
  def undo(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Update the`htmlElement` of a MBC instance.Should call it manually when the`htmlElement` resize.
    
    * Syntax:* `.updateUIOnResize(isLazy, callback)`
    
    | parameter | type | description |
    |  |  |  |
    | isLazy * (optional) *| `boolean` | Default false.Set true to avoid to update too frequently. |
    | callback | `function()` | Callback of finish updating.Might abort the earlier callback when`isLazy` is true. |
    
    @example
  ```javascript
  window.addEventListener('resize',function(){
    painter.updateUIOnResize(true, function(){
    console.log('painter update');
    });
  });
  ```
    */
  def updateUIOnResize(): Unit = js.native
  def updateUIOnResize(isLazy: Boolean): Unit = js.native
  def updateUIOnResize(isLazy: Boolean, callback: js.Function0[Unit]): Unit = js.native
}

