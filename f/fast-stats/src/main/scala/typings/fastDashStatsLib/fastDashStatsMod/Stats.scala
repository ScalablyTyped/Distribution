package typings
package fastDashStatsLib.fastDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-stats", "Stats")
@js.native
class Stats () extends js.Object {
  def this(opts: StatsOpts) = this()
  /**
       * Number of elements
       */
  var length: scala.Double = js.native
  /**
       * Arithmetic Mean
       * The arithmetic mean is calculated as the sum of all data points divided by the number of data points. This is useful for data sets that are fairly uniform, following a linear or binomial distribution. Use the amean() method or the ???()? method to get at it:
       */
  def amean(): scala.Double = js.native
  /**
       * Band-pass filtering
       * The band_pass() filter method returns a new Stats object with all its data points within the specified range. This method takes in three arguments. The first is the lower bound of the range, the second is the upper bound of the range. Both these arguments are required.
       * The third argument specifies whether the range is open or closed. An open range does not include the upper and lower bounds while a closed range includes them. If not specified (or set to false), the range is closed. If set to true the range is open.
       * Band pass filtering should be used if the range for your data is rigid and never changes.
       */
  def band_pass(low: scala.Double, high: scala.Double): Stats = js.native
  /**
       * Band-pass filtering
       * The band_pass() filter method returns a new Stats object with all its data points within the specified range. This method takes in three arguments. The first is the lower bound of the range, the second is the upper bound of the range. Both these arguments are required.
       * The third argument specifies whether the range is open or closed. An open range does not include the upper and lower bounds while a closed range includes them. If not specified (or set to false), the range is closed. If set to true the range is open.
       * Band pass filtering should be used if the range for your data is rigid and never changes.
       */
  def band_pass(low: scala.Double, high: scala.Double, open: scala.Boolean): Stats = js.native
  /**
       * Fresh copy
       */
  def copy(): Stats = js.native
  /**
       * The distribution() method tells you how your data is distributed. You need to set the bucket_precision or buckets configuration options if you plan on using this method. It will then split your data into buckets based on the value of bucket_precision or buckets and tell you how many data points fall into each bucket. You can use this to plot a histogram of your data, or to compare it to commonly known distribution functions.
       * The return value is a sparse array of buckets with counts of datapoints per bucket. To save on memory, any empty buckets are undefined. You should treat an undefined bucket as if it had 0 datapoints.
       */
  def distribution(): js.Array[Bucket] = js.native
  /**
       * Geometric Mean
       * The geometric mean is the nth root of the product of all data points where n is the number of data points. This is useful for data sets that follow an exponential or log-normal distribution. Use the gmean() method to get at it:
       */
  def gmean(): scala.Double = js.native
  /**
       * Geometric Standard Deviation
       * The geometric standard deviation tells you the spread of your data if it follows a log-normal or exponential distribution. Use the gstddev() method to get at it.
       */
  def gstddev(): scala.Double = js.native
  /**
       * IQR Filtering
       * IQR, or Inter Quartile Range filtering filters data based on the spread of the data. It is much more adaptive to changes in data ranges. Use the iqr() method to IQR filter a dataset. The iqr() method does not accept any arguments.
       * In some cases, IQR filtering may not filter out anything. This can happen if the acceptable range is wider than the bounds of your dataset.
       */
  def iqr(): Stats = js.native
  /**
       * Median
       * The median is the middle point of the dataset when sorted in ascending order. This is useful if your dataset has a lot of outliers and noise that would not normally be found in a complete population. Use the median() method to get at it:
       * If your data set contains an odd number of points, the median will be the middle point. If it contains an even number of points, then the median will be the arithmetic mean of the two middle points.
       * If your Stats object is configured to use buckets and has store_data set to false, then the median will be an approximation of the actual median.
       */
  def median(): scala.Double = js.native
  /**
       * 95% Confidence Margin of Error
       * The Margin of Error value tells you the range within which the real arithmetic mean of the population is likely to be with 95% confidence. Use the moe() method to get at it.
       * This value suggests that we are 95% certain that the real mean of the population is within 2.60 of the calculated arithmetic mean of 4.67. We could use this to find out the percent error in our sample. In this case there is a 55.71% error.
       * The margin of error is inversely proportional to the square root of the number of data points, so increasing the size of your sample will reduce the margin of error. It is good to strive for a margin of error of less than 5%.
       */
  def moe(): scala.Double = js.native
  /**
       * Any Percentile
       * You can also get at any percentile value within the data. Use the percentile() method to get at this data. The percentile() method takes in a single argument. This is a number between 0 and 100 (both inclusive) that specifies which percentile point you want.
       * Passing in 50 as an argument will return the median, while 25 and 75 will return the first and third quartiles respectively. These three special values may be arithmetic means of two other values within the set. All other arguments will return a number from the data set.
       * If your Stats object is configured to use buckets and has store_data set to false, then the percentile value returned will be an approximation of the actual percentile based on the configured bucket_precision or buckets.
       */
  def percentile(n: scala.Double): scala.Double = js.native
  /**
       * Remove element from back
       */
  def pop(): scala.Double = js.native
  /**
       * Add elements to back
       */
  def push(args: scala.Double*): scala.Unit = js.native
  def push(args: js.Array[scala.Double]): scala.Unit = js.native
  /**
       * Range
       * The range() method tells you the minimum and maximum values of your data set. It returns an array of two values. The first is the lower bound and the second is the upper bound.
       */
  def range(): js.Array[scala.Double] = js.native
  /**
       * Clear all data
       */
  def reset(): scala.Unit = js.native
  /**
       * Remove element from front
       */
  def shift(): scala.Double = js.native
  /**
       * Arithmetic Standard Deviation
       * Also commonly just called the Standard Deviation, with the symbol s. This tells you the spread of your data if it follows a normal (or close to normal) distribution, ie, the bell curve. fast-stats is really fast at calculating the standard deviation of a dataset
       * The arithmetic standard deviation is used in conjunction with the arithmetic mean to tell you the spread of your dataset: [amean-stddev, amean+stddev]. Note that you could also use 2 or 3 standard deviations for different spreads.
       */
  def stddev(): scala.Double = js.native
  /**
       * Add elements to front
       */
  def unshift(args: scala.Double*): scala.Unit = js.native
}

