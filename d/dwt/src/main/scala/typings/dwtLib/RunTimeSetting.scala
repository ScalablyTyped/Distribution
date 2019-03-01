package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTimeSetting extends js.Object {
  var mAntiDamageLevel: scala.Double
  var mBarcodeFormatIds: scala.Double
  var mBarcodeInvertMode: scala.Double
  var mBinarizationBlockSize: scala.Double
  var mColourImageConvertMode: scala.Double
  var mDeblurLevel: scala.Double
  var mEnableFillBinaryVacancy: scala.Double
  var mExpectedBarcodesCount: scala.Double
  var mGrayEqualizationSensitivity: scala.Double
  var mLocalizationAlgorithmPriority: java.lang.String
  var mMaxAlgorithmThreadCount: scala.Double
  var mMaxBarcodesCount: scala.Double
  var mMaxDimOfFullImageAsBarcodeZone: scala.Double
  var mPDFRasterDPI: scala.Double
  var mRegionPredetectionMode: scala.Double
  var mReserved: java.lang.String
  var mScaleDownThreshold: scala.Double
  var mTextFilterMode: scala.Double
  var mTextureDetectionSensitivity: scala.Double
  var mTimeout: scala.Double
}

object RunTimeSetting {
  @scala.inline
  def apply(
    mAntiDamageLevel: scala.Double,
    mBarcodeFormatIds: scala.Double,
    mBarcodeInvertMode: scala.Double,
    mBinarizationBlockSize: scala.Double,
    mColourImageConvertMode: scala.Double,
    mDeblurLevel: scala.Double,
    mEnableFillBinaryVacancy: scala.Double,
    mExpectedBarcodesCount: scala.Double,
    mGrayEqualizationSensitivity: scala.Double,
    mLocalizationAlgorithmPriority: java.lang.String,
    mMaxAlgorithmThreadCount: scala.Double,
    mMaxBarcodesCount: scala.Double,
    mMaxDimOfFullImageAsBarcodeZone: scala.Double,
    mPDFRasterDPI: scala.Double,
    mRegionPredetectionMode: scala.Double,
    mReserved: java.lang.String,
    mScaleDownThreshold: scala.Double,
    mTextFilterMode: scala.Double,
    mTextureDetectionSensitivity: scala.Double,
    mTimeout: scala.Double
  ): RunTimeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mAntiDamageLevel")(mAntiDamageLevel)
    __obj.updateDynamic("mBarcodeFormatIds")(mBarcodeFormatIds)
    __obj.updateDynamic("mBarcodeInvertMode")(mBarcodeInvertMode)
    __obj.updateDynamic("mBinarizationBlockSize")(mBinarizationBlockSize)
    __obj.updateDynamic("mColourImageConvertMode")(mColourImageConvertMode)
    __obj.updateDynamic("mDeblurLevel")(mDeblurLevel)
    __obj.updateDynamic("mEnableFillBinaryVacancy")(mEnableFillBinaryVacancy)
    __obj.updateDynamic("mExpectedBarcodesCount")(mExpectedBarcodesCount)
    __obj.updateDynamic("mGrayEqualizationSensitivity")(mGrayEqualizationSensitivity)
    __obj.updateDynamic("mLocalizationAlgorithmPriority")(mLocalizationAlgorithmPriority)
    __obj.updateDynamic("mMaxAlgorithmThreadCount")(mMaxAlgorithmThreadCount)
    __obj.updateDynamic("mMaxBarcodesCount")(mMaxBarcodesCount)
    __obj.updateDynamic("mMaxDimOfFullImageAsBarcodeZone")(mMaxDimOfFullImageAsBarcodeZone)
    __obj.updateDynamic("mPDFRasterDPI")(mPDFRasterDPI)
    __obj.updateDynamic("mRegionPredetectionMode")(mRegionPredetectionMode)
    __obj.updateDynamic("mReserved")(mReserved)
    __obj.updateDynamic("mScaleDownThreshold")(mScaleDownThreshold)
    __obj.updateDynamic("mTextFilterMode")(mTextFilterMode)
    __obj.updateDynamic("mTextureDetectionSensitivity")(mTextureDetectionSensitivity)
    __obj.updateDynamic("mTimeout")(mTimeout)
    __obj.asInstanceOf[RunTimeSetting]
  }
}

